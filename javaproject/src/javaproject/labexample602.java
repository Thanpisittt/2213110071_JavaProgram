package javaproject;
import javax.swing.*;
public class labexample602 {
public static void main(String[]args) {
	int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	
	double itemprice = 0;
    boolean validitem = false;
    int itemorder = Integer.parseInt(JOptionPane.showInputDialog("enter item number to order "));
    
    for(int i=0;i<validValues.length;i++)
    {
    	if(itemorder == validValues[i])
    	{
    		validitem = true;
    		itemprice = price[i];
    		
    	}
    	
    }//end for
    if(validitem)
    {System.out.println("item"+itemorder);
    System.out.println("price"+itemprice);
    
}
    else {
    	
    	System.out.println("invaliditem");
      
    }
    }
    	
    	
    	
    	
    	
    	
    	}
    

