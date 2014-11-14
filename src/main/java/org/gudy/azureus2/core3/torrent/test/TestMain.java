/*
 * File    : Main.java
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

package org.gudy.azureus2.core3.torrent.test;

import java.io.File;

import org.gudy.azureus2.core3.torrent.TOTorrent;
import org.gudy.azureus2.core3.torrent.TOTorrentFactory;

public class TestMain
{

	public static void main(String[] args) throws Exception
	{

		File f = new File("C:/Users/ThinkPad/Desktop/我的BT文件/上传的文件/060514-614.torrent");
		String tarPathString = "种子清洁(Java万维网)";

		TOTorrent torrent = TOTorrentFactory.deserialiseFromBEncodedFile(f, tarPathString);

		torrent.print();

		torrent.serialiseToBEncodedFile(new File("C:/Users/ThinkPad/Desktop/我的BT文件/清洁后的文件/060514-614.torrent"));

	}
}