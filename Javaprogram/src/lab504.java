package javaprogram;
import java.util.*;
public class lab504 {

	public static void main(String[] args) {
		String fullname, firstname;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. \n: ");
         fullname = scan.nextLine();
         int space = fullname.indexOf(' ');
         firstname = fullname.substring(0,space);
         System.out.println(abbreviatName(fullname)+firstname);
	}
	public static String abbreviatName(String name)
	{
		String yourname = "";
		for(int i=0;i<name.length();i++) 
		{
			if(name.charAt(i) == ' ')
			{
				yourname = (yourname+name.charAt(i+1)).toUpperCase()+".";
				
			}
			
		}
		return yourname ;
	}

}
