/**
 * 
 */
package reverse;

/**
 * 
 * @author BigAnnoy
 *Last_update	2018年8月18日下午8:49:35
 *
 */
public interface Worker {
	public void work();
	public void setReceiveReport(ReceiveReport boss);
	public void getReward(double money);
	public String getName();
	
}
