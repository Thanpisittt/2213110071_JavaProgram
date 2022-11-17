package week2;
import javax.swing.*;
public class lab204 {
static final double TAX_RATE = 0.625;
	public static void main(String[] args) {
String cdid,cdTitle,cdPrice,cdQuantity;
		 cdid = JOptionPane.showInputDialog("This program calculates "
				+ "the total cost of a CD order"+"\nPlease enter the ID of the CD");
		cdTitle=JOptionPane.showInputDialog("Please enter the title of the CD");
	    cdPrice =JOptionPane.showInputDialog(null,"Please enter the price of the CD in U.S. dollars");
	    double CDprice = Double.parseDouble(cdPrice);
	    cdQuantity =JOptionPane.showInputDialog("please enter the quantity to be purchased ");
	    int CDQuantity = Integer.parseInt(cdQuantity);
	    double cdSubtotal = CDprice*CDQuantity;
	    double cdtotal = cdSubtotal*(1+TAX_RATE);
	    JOptionPane.showMessageDialog(null,"CD ID: "+cdid+"\nCD Title: "+cdTitle+"\nCD Unit price: $"+cdPrice
	    		+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal $"+cdSubtotal+"\nTax rate: "+(TAX_RATE*10)+"%"+"\nTotal: $"+cdtotal+"\n"+"\nEnd of program");
	}

}
