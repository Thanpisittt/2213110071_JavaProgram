import javax.swing.*;
import java.util.Random;
public final class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance +" input money to withdraw"));
		if (withdraw>balance)
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than balance ","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if (withdraw>20000)
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than 20000 ","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw%100!=0)
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw  "+withdraw%100+" Baht.","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else
			
		{JOptionPane.showConfirmDialog(null,"you withdraw"+withdraw+" baht"+"\n1000 = "+withdraw/1000+" baht."+
				"\n500 = "+(withdraw%1000)/500+" baht."+"\n100 = "+(withdraw%500)/100+" baht.");}
		

	}

}
