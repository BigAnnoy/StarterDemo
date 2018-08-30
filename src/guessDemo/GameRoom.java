package guessDemo;

import java.awt.Choice;
import java.util.Scanner;

/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月21日下午8:48:46
 *
 */
public class GameRoom {
	private HumanPlayer p1=null;
	private ComPlayer p2=null;
	
	private long roomId;
	private String roomName;
	private String roomPass;
	
	public GameRoom() {
		initGame();
		startGame();
		endGame();
		
	}
	
	/**
	 * 
	 */
	private void endGame() {
		// TODO 自动生成的方法存根
		
	}

	public void initGame() {
		//初始化玩家
		p1=new HumanPlayer();
		p2=new ComPlayer();
		//初始化其他属性
		for(int i=0;i<50;i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("加载成功");
		}
	};
	
	/**
	 * 
	 */
	private void choiceRole() {
		// TODO 自动生成的方法存根
		System.out.println("对方角色：1-fengjian；2-倪妮 3-正南");
		System.out.println("请选择：");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray= {"fengjian","倪妮","正南"};
		p2.setName(nameArray[choice-1]);
		p1.setName("小新");
		System.out.println(p1.getName()+" VS. "+p2.getName());
	}

	/**
	 * 
	 */
	private void showMenu() {
		// TODO 自动生成的方法存根
		System.out.println("欢迎进入《"+roomName+"》");
		System.out.println("1-剪刀 2-布 3-石头");
	}

	public void startGame() {
		showMenu();
		choiceRole();
		System.out.println(p1.getName()+"请出拳");
		Scanner input=new Scanner(System.in);
		p1.setFist(input.nextInt());
		int fist1 = p1.getFist();
		int fist2=p2.getFist();	
		
	};
	
	public void judge() {
		
	}
	
	
}
