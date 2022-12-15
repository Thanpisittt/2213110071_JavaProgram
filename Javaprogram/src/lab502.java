package javaprogram;
import javax.swing.*;
public class lab502 {
static String email;
	public static void main(String[] args) {
	inputemail();
	}
	public static void inputemail() 
	{
		String ans="";
	
		do {
		email = JOptionPane.showInputDialog("input your email");
		checkEmail(email);
		ans = JOptionPane.showInputDialog("Continue [y||Y to Continue]");
		
	}while(ans.equalsIgnoreCase("y"));
	}
	
	public static void checkEmail(String Check)
	{
		while(Check.startsWith("@")||Check.contains(" "))
		{
			Check= JOptionPane.showInputDialog("input your email again ");
			
		}
		Check = Check.toLowerCase();
		//boolean Cemail = Check.endsWith("@gmail.com")||Check.endsWith(JOptionPane.showMessageDialog(null,checkemail));
		JOptionPane.showMessageDialog(null, booleancheckemail(Check)?"your email is "+Check
				:"your email is not hotmail or gmail dot com");
	}
public static boolean booleancheckemail(String mail)
{
if(mail.endsWith("@gmail.com")||mail.endsWith("hotmail.com"))
{return true;}
else 
	{return false;
	}
}

}
