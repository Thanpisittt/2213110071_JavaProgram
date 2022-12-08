package week4;
import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) {
		String inputEmail=JOptionPane.showInputDialog("input your email: ");
		while(inputEmail.startsWith("@")||inputEmail.contains(" "))
		{
			inputEmail=JOptionPane.showInputDialog("input your email, again : ");
			
		}
		inputEmail = inputEmail.toLowerCase();
		/*if (inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com"))
				{
			JOptionPane.showMessageDialog(null,"your email is "+inputEmail);
			
				}
		else
		{
			JOptionPane.showMessageDialog(null,"your email is not gmail or hotmail dot com");
			
		}*/
		boolean checkEmail=inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		
		JOptionPane.showMessageDialog(null,(checkEmail)
				?"Your e-mail is"+inputEmail:"your email is not hotmail or gmail dot com");
		
	}

}
