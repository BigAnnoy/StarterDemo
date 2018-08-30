package ioDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 从给定url上读取文件内容 只支持http
 * @author BigAnnoy
 *Last_update	Aug 29, 20187:27:17 PM
 *
 */
public class ReadUrlContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.163.com/index.html");
			try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()))){
				String line =null;
				while( (line=bufferedReader.readLine())!= null) {
					System.out.println(line);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
