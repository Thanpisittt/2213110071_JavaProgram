package javaproject;
import java.util.*;
public class lab603 {
	static Scanner scan = new Scanner (System.in);
	static int[] numberofInteger = {78, 36, 58, 41, 25, 92,75};
	public static void main(String[] args) {
		System.out.print("input index of array : ");
		int indexofArray = scan.nextInt();
        while(indexofArray<0||indexofArray>(numberofInteger.length-1))
        {
        	System.out.print("input index of array, again : ");
    	    indexofArray = scan.nextInt();
        }
        System.out.println();
        System.out.println("Value in current index is "+(numberofInteger[indexofArray]));
        //System.out.println("Value in next index is "+(numberofInteger[indexofArray+1]));
        if(indexofArray == 6)
        {
        	System.out.println("sorry, "+indexofArray+" is the last index in array");
        }
        else 
        {
        	System.out.println("Value in next index is "+(numberofInteger[indexofArray+1]));
      
      
        }

	}

}
