package week2;
import java.util.*;
public class Lab203 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Input two integers (a b): ");
	System.out.println();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum =num1+num2;
		int num3 ;
		System.out.println("Sum of two integers : "+(sum));
		int digit =0;
		while(sum!=0)
		{
			sum/=10;
			digit++;
		}
System.out.println("Digit number of sum of said two integers : \n"+digit);
	}

}
