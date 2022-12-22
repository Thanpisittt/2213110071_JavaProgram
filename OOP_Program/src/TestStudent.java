import java.util.*;
public class TestStudent {
static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
	     System.out.print("How many student in classroom : ");
         Student[] std = new Student[scan.nextInt()]; //define array object
         System.out.println();
         
         for(int i=0;i<std.length;i++)
         {
        	 std[i] = new Student() ;  //declare array object 
        	 System.out.print("input student name: ");
        	 std[i].setName(scan.next());
        	 System.out.print("input student score : ");
        	 std[i].setScore(scan.nextInt());
        	 System.out.println("------------------------------");
    
        	 while(!std[i].checkScore()) {
        		 System.out.print("input student score, again : ");
        	 std[i].setScore(scan.nextInt());
        	 }
         }// for 
         System.out.println();
         //System.out.println("List of Pass Student: (>=50)");
         for(Student _std : std)
         {
        	 if(_std.isPass())
        	 {
        		 System.out.println(">>"+_std.getName()+ " Get grade "+findgrade(_std.getScore()));
        	 }
         }
	}//main 
 static String findgrade(int score ) {
	 String grade ="";
	if(score >=80)
	{
		grade= "A"; 
	}
	else if (score<80 && score >=75)
	{
		grade= "B+";
	}
	else if (score<75 && score >=70)
	{
		grade= "B";
	}
	else if (score<70 && score >=65)
	{
		grade= "C+";
	}
	else if (score<65 && score >=60)
	{
		grade= "C";
	}
	else if (score<60 && score >=55)
	{
		grade= "D+";
	}
	else if (score<55 && score >=50)
	{
		grade= "D";
	}
	else if (score<49)
	{
		grade= "F";
	}
	return grade ; 
}
}
