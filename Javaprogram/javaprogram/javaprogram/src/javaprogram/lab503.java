package javaprogram;
import javax.swing.*;
public class lab503 {
static int inputyear;
	public static void main(String[] args) {
      inputyear = Integer.parseInt(JOptionPane.showInputDialog("input year")); 
     boolean check = Checkyear(inputyear);
     while(!Checkyear(inputyear))
     {
   	  inputyear =  Integer.parseInt(JOptionPane.showInputDialog("please input year between 1000-3000"
     +"\ninput year again")); }
     /*if(isLeapyear(inputyear))
     {
    	 JOptionPane.showMessageDialog(null, inputyear+" is leaf Year");
    	 
     }
     else {
    	 JOptionPane.showMessageDialog(null, inputyear+"isnt leaf Year");
     }
     */
     JOptionPane.showMessageDialog(null, inputyear+(isLeapyear(inputyear)?"is leap year":"is not leap year" ));
     }
	//endofmain
	public static boolean Checkyear(int year)
	{
		if((year>=1000&&year<=3000))
		{
			return true;
		}
		else {
			return false;}
	}
	public static boolean isLeapyear(int year)
	{
		if((year%4==0)&&((year%100!=0)||(year%400==0)))
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
		
		
	}

}
