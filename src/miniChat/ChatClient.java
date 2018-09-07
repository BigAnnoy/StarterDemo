package miniChat;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

/**
 * 
 * @author BigAnnoy Last_update 2018年9月7日下午6:29:43
 *
 */
public class ChatClient extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6910115906432855305L;
	TextField textField = new TextField();
	TextArea textArea = new TextArea();
	Socket socket = null;
	DataOutputStream outputStream;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ChatClient().launchFrame();

	}

	public void connectServer() {

		try {
			socket = new Socket(InetAddress.getLocalHost(), 1234);
			System.out.println("Connected!");
			outputStream = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void disconnectServer() {
		try {
			outputStream.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void launchFrame() {
		this.setLocation(1024, 768);
		this.setSize(1024, 768);
		add(textField, BorderLayout.SOUTH);
		add(textArea, BorderLayout.NORTH);
		textField.addActionListener(new tfListener());
		pack();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				disconnectServer();
				System.exit(0);
			}

		});
		this.setVisible(true);
		connectServer();
	}

	private class tfListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = textField.getText().trim();
			textArea.setText(s);
			textField.setText("");
			outPut(s);
		}

		public void outPut(String s) {
			try {
				outputStream.writeUTF(s);
				outputStream.flush();
				// outputStream.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
