import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width = Double.parseDouble(JOptionPane.showInputDialog(null,"input width"));
		double length = Double.parseDouble(JOptionPane.showInputDialog(null,"input length"));
		String color = JOptionPane.showInputDialog(null,"input color");
		Rectangle rec = new Rectangle(width,length,color);
		JOptionPane.showMessageDialog(null, rec+"\nArea of Rectangle is "+rec.getArea());
	}
	

}
