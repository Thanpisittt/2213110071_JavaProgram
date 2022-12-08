package week4;
import java.util.*;
public class lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Message : ");
        String Message= scan.nextLine();
        Message.toLowerCase();
        if(Message.indexOf("nichi")>=0)
        {
        	System.out.println("Nichi is a sentence");
        	
        }
        else{
        	System.out.println(Message);
        }
	}
	
}
