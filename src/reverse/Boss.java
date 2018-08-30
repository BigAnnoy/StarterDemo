/**
 * 
 */
package reverse;

import java.awt.List;
import java.util.ArrayList;

/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月18日下午8:53:35
 *
 */
public class Boss implements ReceiveReport {

	/* （非 Javadoc）
	 * @see reverse.ReceiveReport#receiveReport(java.lang.String, java.lang.String)
	 */

	
	private	Worker worker;
	private ArrayList<Worker> workers=new ArrayList<>();
	private volatile int index=0;
	
	public void addWorker(Worker worker) {
		workers.add(worker);
		worker.setReceiveReport(this);
	}

	
	public void sendTask() {
		for(Worker w:workers) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					w.work();
					// TODO 自动生成的方法存根
					
				}
			}).start();

		}
	}
	
	
	public void receiveReport(Worker worker, String report) {
		// TODO 自动生成的方法存根
		int index=++this.index;
		
		System.out.println(worker.getName()+"获得第"+index+"名");
		if (index<=3) {
			worker.getReward(1000*(4-index));
		}
		}
		
}


