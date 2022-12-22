import java.util.Scanner;
import java.text.*;
public class StockProduct {
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		DecimalFormat fm = new DecimalFormat ("#,###.00");
		Product[] productList = new Product[4];
        for(int i =0;i<productList.length;i++)
        {
        	productList[i] = new Product() ;
        	 System.out.print("Input product id : ");
        	 productList[i].setid(scan.next());
        	 System.out.print("Input product unit : ");
        	 productList[i].setUnit(scan.nextInt());
        	 System.out.print("Input product price : ");
        	 productList[i].setPrice(scan.nextDouble());
        	 System.out.println();
        	 while(!productList[i].check())
        	 {
        		 System.out.print("Input product unit, agian : ");
            	 productList[i].setUnit(scan.nextInt());
            	 System.out.print("Input product price, agian : ");
            	 productList[i].setPrice(scan.nextDouble());
        	 }
				System.out.println("----------------------------");
	        }
        double sum = 0;
        for(Product pd : productList)
        {
        	sum+=pd.calculate();
        	System.out.println("product id : "+pd.getid()+","+"Total price = "+fm.format(pd.calculate())+"Baht.");
        }
        System.out.println("----------------------------");
        System.out.println("Total price of all products is "+fm.format(sum)+" Baht.");

	}

}
