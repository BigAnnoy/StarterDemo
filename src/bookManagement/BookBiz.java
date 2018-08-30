package bookManagement;

import javax.swing.JOptionPane;

/**
 * 
 * @author BigAnnoy
 *Last_update	Aug 24, 201811:53:16 AM
 *
 */
public class BookBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0;
		
		Book[] books = new Book[3];
		for (int i = 0; i < books.length; i++) {
			books[i]=new Book();
			String name=JOptionPane.showInputDialog("请输入书名:");
			books[i].setName(name);
			boolean strPriceIsDigit=false;
			String strPrice = null;
		
			
			
			
			
			books[i].setPrice(Double.parseDouble(strPrice));
			String count=JOptionPane.showInputDialog("请输入购买数量：");
			books[i].setNum(Integer.parseInt(count));
			total+=books[i].getNum()*books[i].getPrice();
			
		}
		System.out.println("书名\t单价\t购买数量");
		for (Book book : books) {
			System.out.println(book.getName()+"\t"+book.getPrice()+"\t"+book.getNum());
		}
		System.out.println("合计："+total+"元");
		
	}

}
