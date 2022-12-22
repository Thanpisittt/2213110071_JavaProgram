package test;
import java.util.*;
public class lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your name ");
		String fullname = scan.nextLine();
		int space =fullname.indexOf(' ');
		String firstname = fullname.substring(0,space);
				splitname(fullname);
		System.out.print("your name is "+splitname(fullname) + firstname );
	}
public static String splitname(String fullname)
{
	String yourname ="";
	for(int i=0;i<fullname.length();i++)
	{
		if(fullname.charAt(i)==' ')
				{
			yourname += (fullname.charAt(i+1))+".";
				}
		
	}
	return yourname.toUpperCase();
	
	}
}
