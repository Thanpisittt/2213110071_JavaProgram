package javaproject;

import javax.swing.JOptionPane;

public class labexample602_1 {
static	int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
static	double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
static	double itemprice = 0;
  static  boolean validitem = false;
	public static void main(String[] args) {
	
			inputitem();
	}
   public static void inputitem() {
	   
	   int itemorder = Integer.parseInt(JOptionPane.showInputDialog("enter item number to order "));
	 // boolean Chkitem; 
	   if(checkitem(itemorder))
	   {
		   System.out.println("item"+itemorder);
		    System.out.println("price"+itemprice);
		    
	   }
	   else {
	    	
	    	System.out.println("invaliditem");
	      
	    }
   }
   public static boolean checkitem(int itemorder) {
	   for(int i=0;i<validValues.length;i++)
	    {
	    	if(itemorder == validValues[i])
	    	{
	    		validitem = true;
	    		itemprice = price[i];
	    		
	    	}
	    	
	    }//end for
	   return validitem;
   }//
}
