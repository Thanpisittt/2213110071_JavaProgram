package week4;
import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstname,lastname,fullname;
		System.out.print("Input full name: ");
		fullname = scan.nextLine();
		int space=fullname.indexOf(' ');
		
		if(space==-1)
		{
			System.out.println("Incorrect Name");
			
		}
		else
		{
			firstname=(fullname.substring(0,fullname.indexOf(" ")));
			lastname=(fullname.substring(fullname.indexOf(" ")));
			System.out.println("First Name: "+firstname.toUpperCase()+"\nLast Name :"+lastname.toLowerCase());
			
		}
		
		

	}

}
