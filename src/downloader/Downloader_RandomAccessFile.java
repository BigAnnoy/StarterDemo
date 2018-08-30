package downloader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;



/**
 * 从http协议下载文件流，将文件以缓冲流的方式读取到内存
 * @author BigAnnoy
 *Last_update	Aug 30, 20189:39:18 AM
 *
 */
public class Downloader_RandomAccessFile {

	/**
	 * @param args
	 */
	private static final String StrUrl = "http://issuecdn.baidupcs.com/issue/netdisk/MACguanjia/BaiduNetdisk_mac_2.2.2.dmg";
	
	//默认缓存大小
	private static final int MAX_BUFFER_SIZE=10240;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpURLConnection connection = null;
		BufferedInputStream bInputStream = null;
		try {
			URL url =new URL(StrUrl) ;
			connection = (HttpURLConnection)url.openConnection();
			//设置连接属性-Range从服务器请求下载文件的字节范围
			connection.setRequestProperty("Range", "byte=0-");
			connection.connect();
			if (connection.getResponseCode()/100!=2) {
				System.out.println("连接的响应不在200以内，连接错误，请重试");
				return;
			}
			int fileSize = connection.getContentLength();
			bInputStream = new  BufferedInputStream(connection.getInputStream(),MAX_BUFFER_SIZE);
			int downloaded = 0;//已下载的字节数
			String fileName = url.getFile();
			fileName = fileName.substring(fileName.lastIndexOf("/")+1);
//			
			RandomAccessFile file=new RandomAccessFile(new File(fileName), "rw");
			
			file.setLength(0);
			file.seek(0);//将文件指针重置
			while(downloaded<fileSize) {
				byte[] buffer = null;
				if(fileSize-downloaded>MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE];
				}else {
					buffer =new byte[fileSize-downloaded];
				}
				int read = bInputStream.read(buffer);
				if (read == -1) break;
				file.seek(downloaded);
				file.write(buffer,0,read);
				downloaded+=read;
				System.out.println("当前下载进度：" +downloaded*1.0/fileSize*100 +"%");
			}
			System.out.println("下载完成");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			connection.disconnect();
			try {
				bInputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}

}
