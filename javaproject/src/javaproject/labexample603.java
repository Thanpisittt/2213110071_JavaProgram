package javaproject;
import java.util.*;
public class labexample603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] num = new int [5];
		for(int i=0;i<num.length;i++)
		{
			System.out.print("input number : ");
			num[i] = scan.nextInt();
			
		}//end for
		sumOfPos(num);
		System.out.println("Summation of positive number is " +sumOfPos(num) );
	}
public static int sumOfPos(int []num)
{
	int sum=0;
	for(int nums:num)
	{
		if(nums>=0)
		{
			sum+=nums;
		}
	}
	return sum ;
	}
}
