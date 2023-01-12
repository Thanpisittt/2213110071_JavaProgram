package test;
import java.util.*;
import javax.swing.*;

public class lab501 {

	public static void main(String[] args) {
		String email =JOptionPane.showInputDialog("input your email");
		CheckEmail(email);
		email.toLowerCase();
		JOptionPane.showMessageDialog(null, CheckEmail(email)?"your email is "+email:"your email is not @gmail.com or @hotmail.com");
	}
	public static boolean CheckEmail(String email) {
		while(email.startsWith("@")||email.contains(" "))
		{
			email =JOptionPane.showInputDialog("input your email, again");
			
		}
		 boolean checkmail = ((email.endsWith("@gmail.com")||email.endsWith("hotmail.com")));
		 return checkmail ;
	}
}
