package ioDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



/**
 * 对象序列化和反序列化操作（对象实现Serializable接口）
 * @author BigAnnoy
 *Last_update	Aug 29, 20188:15:36 PM
 *
 */
public class ObjectStreamDemo {

	/**
	 * @param args
	 */
	private final static String FilePath1="src/ioDemo/saving";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Player player1=new Player("Neo", 99);
//		//使用对象流将序列化的对象写入到文件中
//		FileOutputStream fileOutputStream = null;
//		try {
//			fileOutputStream = new FileOutputStream(FilePath1);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(player1);
		
		FileInputStream fileInputStream = new FileInputStream(FilePath1);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Player player2=(Player)objectInputStream.readObject();
		System.out.println(player2);
	}
}
	class Player implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String nickName;
		private int level;
		
		
		public Player(String nickName, int level) {
			super();
			this.nickName = nickName;
			this.level = level;
		}
		
		@Override
		public String toString() {
			return "Player [nickName=" + nickName + ", level=" + level + "]";
		}

		public String getNickName() {
			return nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		
		
	}

