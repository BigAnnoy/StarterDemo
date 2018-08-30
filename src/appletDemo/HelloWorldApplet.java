package appletDemo;
import java.applet.*;
import java.awt.*;
/**
 * 
 * @author BigAnnoy
 *Last_update	Aug 29, 20185:50:17 PM
 *
 */
public class HelloWorldApplet extends Applet{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g) {
		g.drawString("Hello World", 25, 50);
	}

}
