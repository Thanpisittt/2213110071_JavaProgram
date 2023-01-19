import java . util.*;
public class BookDemo {

	public static void main(String[] args) {
             Book bk = new Book();
             Scanner scan = new Scanner (System.in);
             System.out.print("input book title: ");
             bk.setTitle(scan.next());
             System.out.print("input book price: ");
             bk.setPrice(scan.nextFloat());
             System.out.print("input book publish year: ");
             bk.setPublishyear(scan.nextInt());
             
             System.out.println("Title: "+bk);
	}

}
