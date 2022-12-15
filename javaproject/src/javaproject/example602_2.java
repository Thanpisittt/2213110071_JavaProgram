package javaproject;
import javax.swing.JOptionPane;
public class example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptwasfound = false;
	public static void main(String[] args) {
			String search = JOptionPane.showInputDialog("Enter department name");
			
			 for(int i = 0 ;i<deptName.length;i++)
			 {
				 if(search.equalsIgnoreCase(deptName[i]))
				 {
					 deptwasfound=true;
				 }
				 
			 }//end for
			 if(deptwasfound)
			 {
				 JOptionPane.showMessageDialog(null,search + " was found in a list ");
			 }
			 else {
				 JOptionPane.showMessageDialog(null,search + " was not found in a list ");
				 }
			 
	}
	 
}
