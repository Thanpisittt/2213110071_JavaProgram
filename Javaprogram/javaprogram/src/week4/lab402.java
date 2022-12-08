package week4;
import java.util.*;
public class lab402 {

	public static void main(String[] args) {
		int space=0;
	int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence=scan.nextLine();
		 while(!sentence.endsWith("."))
		    {
		    	System.out.print("The sentence must end with full stop point : ");
		    	sentence = scan.nextLine();
		    	
		    }
		 for( i=0;i<sentence.length();i++)
		 {
			 if(sentence.charAt(i)==' ')
			 {
				 System.out.println(sentence.substring(space,i));
				 space=i+1;
			 }
			
		 }
		 System.out.println(sentence.substring(space,i));
		
	}

}
