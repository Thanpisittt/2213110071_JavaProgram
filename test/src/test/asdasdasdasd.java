package test;
import java.util.Scanner;
public class asdasdasdasd {

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
	boolean ITstudent =isITStudent(id);
	boolean ITsubject =isITSubject(subId);
	System.out.println("studenn id : "+id);
		displayData(ITstudent,ITsubject);
		System.out.println();
		System.out.println();
		System.out.println(ITstudent+"\n"+ITsubject);
}
public static boolean isLength(String stid,String subID)
{
	//String subidreal = subID+"";
	if(stid.length()==10 && subID.length()==7) 
	{
		return true;

	}
	else 
	{
		return false;
	}


}//end isLength
public static boolean isITStudent(String id)
{
	if(id.substring(0,6).equals("211311"))
	{
		return true;
	}
	else
	{
		return false;
	}
	}//endisITStudent
public static boolean isITSubject(String subId)
{
	if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) 
	{
	       return true;
	}
	else
	{
		return false;
	}
	
	}//end
public static void displayData(boolean y,boolean z)
{
	if(y&&z)
	{
		System.out.print("1st year student in IT and\nEnroll in courses for year 1");
	}
	else if(!y&&z)
	{
		System.out.print("not 1st year student in IT and\n enroll in courses for year 1");
	}
	else if(y&&!z)
	{
		System.out.print("1st year student in IT and\nnot enroll in courses for year 1");
	}
	
	}



}