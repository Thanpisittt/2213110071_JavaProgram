package javaproject;
import javax.swing.*;
public class lab605 {

	public static void main(String[] args) {
		int[] number =new int [5];
		for(int i=0;i<number.length;i++)
		{
			number[i]=Integer.parseInt(JOptionPane.showInputDialog("input number "+(i+1)+":"));
			
		}
		showeven(number);
		showodd(number);
	}
	public static void showeven(int[] number)
	{
		String even ="" ;
		
		for (int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
			{
			even+= number[i]+" ";
				
			}
			
		}
		JOptionPane.showMessageDialog(null,"List of even number "+ even);
		
	}
	public static void showodd(int[] number)
	{
		String odd = "";
		for (int i=0;i<number.length;i++)
		{
			if(number[i]%2!=0)
			{
				odd = number[i]+"";
				JOptionPane.showMessageDialog(null,"List of odd number "+ odd);
			}
			}
			
		}
		

}
