package javaproject;
import java.util.*;
public class lab602 {
	static Scanner scan = new Scanner (System.in);
	static double averageNumber=0;
	public static void main(String[] args) {
		double[] inputscore = new double[5];
		int sum=0;
		for(int i=0;i<inputscore.length;i++)
		{
			System.out.print("Input score of student "+(i+1)+":");
			inputscore[i]=scan.nextDouble();
			sum+=inputscore[i];
		}//end for 
		System.out.println();
		averageNumber=sum/(inputscore.length);
		System.out.println("Average of "+ inputscore.length+ "student is" +averageNumber);
		for(int a =0;a<inputscore.length;a++)
		{
			if(inputscore[a]>averageNumber)
			{
				System.out.println("student "+(a+1)+"("+inputscore[a]+")");
			}
		}
	}

}
