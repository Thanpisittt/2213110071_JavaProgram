import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.*;
public class CalculateTwonumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwonumber frame = new CalculateTwonumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwonumber() {
		setTitle("CalculateTwonumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter number 1");
		lblNumber1.setBounds(10, 11, 132, 31);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(164, 11, 86, 31);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(10, 53, 132, 31);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(164, 53, 86, 31);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(330, 211, 132, 50);
		contentPane.add(lblResult);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(159, 120, 140, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setBounds(164, 164, 135, 23);
		contentPane.add(onedigit);
		
		final JRadioButton twodigit = new JRadioButton("2 Digit");
		twodigit.setBounds(164, 190, 124, 23);
		contentPane.add(twodigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);

		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(10, 169, 132, 14);
		contentPane.add(rdbOperator);
		
		final JCheckBox Checkbox = new JCheckBox("Show Result at dialogBox");
		Checkbox.setBounds(165, 271, 164, 23);
		contentPane.add(Checkbox);
		
		JLabel Optiontoshow = new JLabel("Option to show");
		Optiontoshow.setBounds(33, 267, 86, 31);
		contentPane.add(Optiontoshow);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operator;
				double num1,num2,sum=0;
				//JBotton
				if(e.getSource()==btnOK)
				{
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2 ; 
					if(operator.equals("-"))
						sum = num1-num2 ; 
					if(operator.equals("*"))
						sum = num1*num2 ; 
					if(operator.equals("/"))
						sum = num1/num2 ; 
					lblResult.setText(String.format("%.2f",sum));
					//sum = num1+num2;
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected())
					{
						frmNumber = new DecimalFormat("#,###.0");
						
					}
					else if(twodigit.isSelected())
					{
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText(frmNumber.format(sum));
					//
					if(Checkbox.isSelected())
					{
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
				}
			}
		});
		btnOK.setBounds(100, 354, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(21, 124, 121, 14);
		
		contentPane.add(lblOperator);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEXIT.setBounds(199, 354, 89, 23);
		contentPane.add(btnEXIT);
		
		
		
	
		
		
		
	}
	}

