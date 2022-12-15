package javaproject;
import javax.swing.*;
public class lab606 {

	public static void main(String[] args) {
		int[] num = {25, 78, 41, 22, 36, 85,37};
		int index =Integer.parseInt(JOptionPane.showInputDialog("input index of Array: "));
		while(checkIndex(num,index))
        {
        	
			index = Integer.parseInt(JOptionPane.showInputDialog("input index of Array ,again: "));
        }
		currentData(num,index);
		prevData(num,index);
		nextData(num,index);
		String prevData = (prevData(num,index)!=-1)?"previous Data,nums["+(index-1)+"] is "+prevData(num,index):"no previous Data";
		String nextData = (nextData(num,index)!=-1)?"next Data,nums["+(index+1)+"] is "+nextData(num,index):"no next Data";

		JOptionPane.showMessageDialog(null,"Current data,nums["+index+"] is "+currentData(num,index)+"\n"+prevData+"\n"+nextData);
				
	}
 public static boolean checkIndex(int[] nums ,int index)
 {
	 return ((index <0|| index>(nums.length-1))?true:false);
 }
 public static int currentData(int[] nums ,int index)
 {
	 return nums[index];
 }
 public static int prevData(int[] nums ,int index)
 {
	 return index==0?-1:nums[index-1];
 }
 public static int nextData(int[] nums  ,int index)
 {
	 return index == nums.length-1?-1:nums[index+1];
 }
}
