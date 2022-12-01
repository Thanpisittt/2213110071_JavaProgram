package week4;
import java.util.*;
public class Example401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputword="";
		String txtword ="";
		while(true)
		{
			System.out.print("enter word: ");
			inputword = scan.next();
			if(inputword.equalsIgnoreCase("stop"))
			{
				break;
			}
			txtword= txtword+inputword+"";
			
		}
		System.out.println(txtword.toUpperCase());
	}

}
