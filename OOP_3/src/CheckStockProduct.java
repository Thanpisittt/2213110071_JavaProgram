import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product in stock : ");
		Product[] productList = new Product[scan.nextInt()];
		System.out.println();
		for(int i =0;i<productList.length;i++)
        {
        	productList[i] = new Product() ;
        	 System.out.print("Input product id : ");
        	 productList[i].setid(scan.next());
        	 System.out.print("Input product unit : ");
        	 productList[i].setUnit(scan.nextInt());
        	
        	 System.out.println();
	} System.out.println("-----------------------");
		 System.out.println("list of product in LOW status.");
		 System.out.println("-----------------------");
    for(Product pd : productList)
    {
    	if(pd.getUnit() < 5)
    	{
    		
    		 System.out.println(">> "+pd.getid()+" has "+ pd.getUnit()+" Units");
    		
    	}
    	
    }
    System.out.println("-----------------------");
    System.out.println("list of product in NORMAL status.");
    System.out.println("-----------------------");
    for(Product pd : productList)
    {
    	if(pd.getUnit()>4 && pd.getUnit() < 50)
    	{
    		 System.out.println(">> "+pd.getid()+" has "+ pd.getUnit()+" Units");
    	}
    }
    System.out.println("-----------------------");
    System.out.println("list of product in HIGH status.");
    System.out.println("-----------------------");
    for(Product pd : productList)
    {
    	if(pd.getUnit() >= 50)
    	{
    		 System.out.println(">> "+pd.getid()+" has "+ pd.getUnit()+" Units");
    		
    	}
    }
}
}
