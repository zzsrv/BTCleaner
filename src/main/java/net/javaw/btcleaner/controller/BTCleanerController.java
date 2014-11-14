/*
 * @(#)BTCleanerController.java 创建于 2014年8月7日 
 * 
 * Copyright (c) 2014-2015 by JavaW.  
 * URL：http://www.javaw.net
 *
 */
package net.javaw.btcleaner.controller;

import java.io.File;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.gudy.azureus2.core3.torrent.TOTorrent;
import org.gudy.azureus2.core3.torrent.TOTorrentFactory;
import org.gudy.azureus2.core3.util.Constants;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 类名称：BTCleanerController.java
 * <P/>
 * 类描述： BT种子清洁控制器
 * <P/>
 * 创建时间：2014年8月7日
 * <P/>
 * 创建人： 史守阳
 * <P/>
 * 联系方式： ssy.vip^qq.com
 * <P/>
 * 修改人：无
 * <P/>
 * 修改时间：无
 * <P/>
 * 修改备注：无
 * <P/>
 * 版本：v1.0
 * 
 * 
 * SpringMVC中的文件上传
 * 
 * @see 第一步：由于SpringMVC使用的是commons-fileupload实现，故将其组件引入项目中
 * @see 这里用到的是commons-fileupload-xxx.jar和commons-io-xxx.jar
 * @see 第二步：在####-servlet.xml中配置MultipartResolver处理器。可在此加入对上传文件的属性限制
 * @see 第三步：在Controller的方法中添加MultipartFile参数。该参数用于接收表单中file组件的内容
 * @see 第四步：编写前台表单。注意enctype="multipart/form-data"以及<input type="file" name="****"/>
 * 
 * 
 */
@Controller
public class BTCleanerController
{

	@RequestMapping(value = "btcleaner.html")
	public ModelAndView btCleaner() throws Exception
	{
		ModelAndView view = new ModelAndView("/torrent");
		return view;
	}



	@RequestMapping(value = "torrent.html")
	public ResponseEntity<byte[]> torrentCleaner(@PathVariable(value = "torrentFile") @RequestParam MultipartFile torrentFile) throws Exception
	{
		ResponseEntity<byte[]> entity = null;

		// 如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解
		// 如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解
		// 并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件
		if (torrentFile.isEmpty())
		{
			System.out.println("文件未上传");
		} else
		{
			if (torrentFile.getOriginalFilename().lastIndexOf(".") > 0 && ".torrent".equals(torrentFile.getOriginalFilename().substring(torrentFile.getOriginalFilename().lastIndexOf(".")).toLowerCase(Locale.CHINA)))
			{
				File targetTorrentDIR = new File(System.getenv("OPENSHIFT_DATA_DIR") + "torrent");
				// File targetTorrentDIR = new File("H:/torrent");
				if (!targetTorrentDIR.exists())
				{
					targetTorrentDIR.mkdirs();
				}
				String tarPathString = "种子清洁(Java万维网)";

				TOTorrent torrent = TOTorrentFactory.deserialiseFromBEncodedInputStream(torrentFile.getInputStream(), tarPathString);

				File targetTorrentFile = new File(targetTorrentDIR, new String(torrent.getName(), Constants.DEFAULT_ENCODING) + ".torrent");

				/**
				 * 
				 * MultipartFile转File 方法1：torrentFile.transferTo(targetTorrentFile); 方法2：方法强转：spring需配置multipartResolver 方法3：IOUtils.copy(torrentFile.getInputStream(), new FileOutputStream(targetTorrentFile));
				 * 
				 */
				torrentFile.transferTo(targetTorrentFile);

				File targetCleanerTorrentFile = new File(targetTorrentDIR, new String(torrent.getName(), Constants.DEFAULT_ENCODING) + "(Cleaner)" + ".torrent");

				torrent.setName(tarPathString);
				torrent.setComment(tarPathString);
				torrent.setPublisher(tarPathString);
				torrent.setPublisherUrl("http://www.javaw.net");
				torrent.serialiseToBEncodedFile(targetCleanerTorrentFile);

				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.setContentLength(targetCleanerTorrentFile.length());
				headers.setContentDispositionFormData("attachment", new String("种子清洁(Java万维网).torrent".getBytes("UTF-8"), "ISO8859-1"));

				entity = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(targetCleanerTorrentFile), headers, HttpStatus.CREATED);

				System.out.println("文件长度: " + torrentFile.getSize());
				System.out.println("文件类型: " + torrentFile.getContentType());
				System.out.println("文件名称: " + torrentFile.getName());
				System.out.println("文件原名: " + torrentFile.getOriginalFilename());
				System.out.println("原文件存储路径: " + targetTorrentFile);
				System.out.println("清洁后文件存储路径: " + targetCleanerTorrentFile);
				System.out.println("========================================");

			}
		}

		return entity;
	}



	@RequestMapping(value = "error.html")
	public ModelAndView errorFileupload()
	{
		ModelAndView view = new ModelAndView("/error");
		return view;
	}

}
