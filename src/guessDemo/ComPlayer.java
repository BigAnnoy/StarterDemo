/**
 * 
 */
package guessDemo;

import java.util.Random;

/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月21日下午8:05:52
 *
 */
public class ComPlayer {
	//
	public static final int MessageTypeFist = 1;
	public static final int MessageTypeWin = 2;
	public static final int MessageTypeLose = 3;
	
	private String name;
	private int score;
	private int fist;
	
	private String[] fistWords = {
			"动感光波biubiubiu",
			"大象鼻子为什么这么长",
			"必杀：露pp外星人️"
	};
			
	private String[] winWords =  {
			"还有谁",
			"有点意思"
	};
	
	private String[] loseWords = {
			"哎" ,
			"天呐"
	};
	
	public void sendMessage(int msgType) {
		String message = null;
		int index = (int)(Math.random()*1000)%2;
		switch (msgType) {
			
		case MessageTypeFist:
			message=fistWords[index];
			break;
		case MessageTypeLose:
			message=loseWords[index];
			break;
		case MessageTypeWin:
			message=winWords[index];
			break;
		}
		System.out.println(message);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score 要设置的 score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return fist
	 */
	public int getFist() {
		fist = ((int)(Math.random()*1000))%3+1;
		return fist;
	}

	/**
	 * @param fist 要设置的 fist
	 */

}
