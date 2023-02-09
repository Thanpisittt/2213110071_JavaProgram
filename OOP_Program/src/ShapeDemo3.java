import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cylinder = new Cylinder[5];
		double[]radius = new double[5];
		double[]height = new double[5];
		String[] input = new String[5]; 
		for(int i =0;i<5;i++)
		{
		input[i] = JOptionPane.showInputDialog(null,"input radius and height");
		String[] data =input[i].split(" ");
		radius[i] = Double.parseDouble(data[0]);
		height[i] = Double.parseDouble(data[1]);
			cylinder[i]=new Cylinder(radius[i],height[i]);
			
		}
		int i=1 ;
		for(Cylinder _cylinder : cylinder)
		{
			JOptionPane.showMessageDialog(null,"Cylinder "+i+" "+_cylinder.getVolume());;
			i++;
		}
	}

}
