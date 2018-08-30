package ioDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流读写操作
 * @author BigAnnoy
 *Last_update	Aug 29, 20186:16:23 PM
 *
 */
public class ReaderWriterDemo {

	/**
	 * @param args
	 */
	private static final String FilePath1="src/guessDemo/Test.java";
	private static final String FilePath2="src/ioDemo/FileDemo.java";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader bReader=new BufferedReader(new FileReader(FilePath1));)
		//try with resource 
		//自动关闭资源类(资源类必须实现closeable接口）
			{
			
			String line=null;
			while((line=bReader.readLine())!=null) {
				System.out.println(line);
			}

			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}catch(Exception e) {
				if(e.getSuppressed() != null) {
					Throwable[] throwables=e.getSuppressed();
					for(Throwable t:throwables) {
						System.err.println(t.getMessage()+ "caused by"+t.getClass().getSimpleName());
					}
				}
		}
		
		try {
			BufferedWriter bWriter=new BufferedWriter(new FileWriter(FilePath2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}
	
	

}
