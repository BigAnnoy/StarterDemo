package miniChat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

/**
 * 服务器端
 * 
 * @author BigAnnoy Last_update 2018年9月7日下午8:18:23
 *
 */
public class ChatServer {
	static boolean started = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(1234);
			started = true;
			while (started) {
				boolean bConnected = true;
				Socket socket = serverSocket.accept();
				System.out.println("a client connect!");// 测试用
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				while (bConnected) {
					String str = dataInputStream.readUTF();
					System.out.println(str);
				}

				dataInputStream.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
