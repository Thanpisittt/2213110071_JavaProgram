import java.awt.*;
import javax.swing.*;

public class testGUI extends JFrame{

	private static final int WIDTH = 400 ;	
	private static final int HEIGHT= 300 ;
	//
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	//private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	//constructor method
	public testGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length: ",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width: ",SwingConstants.RIGHT);
		lblArea = new JLabel("Enter the area: ",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Enter the Perimeter: ",SwingConstants.RIGHT);
		//
		//txtLength = new JTextField(10);
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		
		add(lblLength);//add(txtLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}
	
	public static void main(String[] args) {
		testGUI prog = new testGUI();

	}

}
