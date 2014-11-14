/*
 * File    : TOTorrentFactory.java
 * Created : 5 Oct. 2003
 * By      : Parg 
 * 
 * Azureus - a Java Bittorrent client
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details ( see the LICENSE file ).
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.gudy.azureus2.core3.torrent;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

import org.gudy.azureus2.core3.torrent.impl.TOTorrentDeserialiseImpl;

public class TOTorrentFactory
{
	public static final long TO_DEFAULT_FIXED_PIECE_SIZE = 256 * 1024;

	public static final long TO_DEFAULT_VARIABLE_PIECE_SIZE_MIN = 32 * 1024;

	public static final long TO_DEFAULT_VARIABLE_PIECE_SIZE_MAX = 4 * 1024 * 1024;

	public static final long TO_DEFAULT_VARIABLE_PIECE_NUM_LOWER = 1024;

	public static final long TO_DEFAULT_VARIABLE_PIECE_NUM_UPPER = 2048;

	public static final long[] STANDARD_PIECE_SIZES = { 32 * 1024, 48 * 1024, 64 * 1024, 96 * 1024, 128 * 1024, 192 * 1024, 256 * 1024, 384 * 1024, 512 * 1024, 768 * 1024, 1024 * 1024, 1536 * 1024, 2 * 1024 * 1024, 3 * 1024 * 1024, 4 * 1024 * 1024 };



	/**
	 * 
	 * 功能描述：无
	 * <P/>
	 * 创建时间：2014年8月23日
	 * <P/>
	 * 创建人： 史守阳
	 * <P/>
	 * 联系方式： ssy.vip^qq.com
	 * 
	 * @param is
	 * @param tarPathString
	 *            替换Map中的文字 //String tarPathString = "种子清洁(Java万维网)";
	 * @return
	 * @throws TOTorrentException
	 */
	public static TOTorrent deserialiseFromBEncodedFile(File file, String tarPathString) throws TOTorrentException
	{
		return (new TOTorrentDeserialiseImpl(file, tarPathString));
	}



	/**
	 * 
	 * 功能描述：无
	 * <P/>
	 * 创建时间：2014年8月23日
	 * <P/>
	 * 创建人： 史守阳
	 * <P/>
	 * 联系方式： ssy.vip^qq.com
	 * 
	 * @param is
	 * @param tarPathString
	 *            替换Map中的文字 //String tarPathString = "种子清洁(Java万维网)";
	 * @return
	 * @throws TOTorrentException
	 */
	public static TOTorrent deserialiseFromBEncodedInputStream(InputStream is, String tarPathString) throws TOTorrentException
	{
		return (new TOTorrentDeserialiseImpl(is, tarPathString));
	}



	/**
	 * 
	 * 功能描述：无
	 * <P/>
	 * 创建时间：2014年8月23日
	 * <P/>
	 * 创建人： 史守阳
	 * <P/>
	 * 联系方式： ssy.vip^qq.com
	 * 
	 * @param data
	 * @param tarPathString
	 *            替换Map中的文字 //String tarPathString = "种子清洁(Java万维网)";
	 * @return
	 * @throws TOTorrentException
	 */
	public static TOTorrent deserialiseFromMap(Map<?, ?> data, String tarPathString) throws TOTorrentException
	{
		return (new TOTorrentDeserialiseImpl(data, tarPathString));
	}
}
