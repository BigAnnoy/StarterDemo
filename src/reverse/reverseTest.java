/**
 * 
 */
package reverse;

/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月18日下午9:09:23
 *
 */
public class reverseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Boss boss = new Boss();
		for(int i=0;i<10;i++) {
			Worker worker=new Employ("Employee["+i+"]");
			boss.addWorker(worker);
		}
		
		boss.sendTask();
	}

}
