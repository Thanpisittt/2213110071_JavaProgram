package javaprogram;
import java.util.Scanner;
public class lab505 {

	public static void main(String[] args) {
		
		inputstudent();

	}
public static void inputstudent() {
	Scanner scan = new Scanner(System.in);
    String id ="";
    String subId;
    do {
    	System.out.print("Enter student id : ");
    	id = scan.nextLine();
    	System.out.print("Enter subject id : ");
    	 subId = scan.nextLine();
    	}
	while(!isLength(id,subId));
	isITStudent(id);
	isITSubject(subId);
		displayData();
	
}
public static boolean isLength(String stid,String subID)
{
	String subidreal = subID+"";
	if(stid.length()!=10 && subidreal.length()!=7) 
	{
		return true;
		
	}
	else 
	{
		return false;
	}
	
	
}
public static boolean isITStudent(String id)
{
	return true;
	}
public static boolean isITSubject(String subId)
{
	return true;
	}
public static void displayData()
{
	}



}
