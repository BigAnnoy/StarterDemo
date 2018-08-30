
/**
 * 
 */
package reverse;
import java.util.Random;
/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月18日下午9:02:20
 *
 */
public class Employ implements Worker {

	/* （非 Javadoc）
	 * @see reverse.Worker#work(reverse.ReceiveReport)
	 */
	private String name;
	private ReceiveReport boss;
	
	public Employ(String name) {
		this.name=name;
	};
	
	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println(name+"is doing this work");
		Random random=new Random();
		Integer time=random.nextInt(10000);
		try {
			Thread.sleep(time);
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		String report="Job Done!";
		boss.receiveReport(this, report);
		
	}

	/* （非 Javadoc）
	 * @see reverse.Worker#setReceiveReport(reverse.ReceiveReport)
	 */
	
	@Override
	public void setReceiveReport(ReceiveReport boss) {
		// TODO 自动生成的方法存根
		this.boss=boss;
	}

	/* （非 Javadoc）
	 * @see reverse.Worker#getReward(double)
	 */
	@Override
	public void getReward(double money) {
		// TODO 自动生成的方法存根
		System.out.println(name+"由于表现突出，获得"+money+"的奖金");
	}

	/* （非 Javadoc）
	 * @see reverse.Worker#getName()
	 */
	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return name;
	}

}
