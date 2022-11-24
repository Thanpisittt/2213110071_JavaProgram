import javax.swing.*;
public class example1 {

	public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("input full name");
    int  birth = Integer.parseInt(JOptionPane.showInputDialog("input birth year"));
    
    while(birth<1980 || birth>2018)
    {
    	birth = Integer.parseInt(JOptionPane.showInputDialog("input birth year"));
    	
    }
    int gender = JOptionPane.showConfirmDialog(null,"Are you female ?","gender ",JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null, "Full name: "+name+"\nBirth Year: "+birth+"\nYou are "+(gender==0?"female":"male"));
	}
	

}
