import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		double[]radius = new double[5];
		double[]height = new double[5];
		for(int i =0;i<5;i++)
		{
			System.out.print("input radius and height");
			radius[i] = scan.nextDouble();
			height[i]=scan.nextDouble();
			cylinder[i]=new Cylinder(radius[i],height[i]);
		}
		int i=1 ;
		for(Cylinder _cylinder : cylinder)
		{
			System.out.println("Cylinder " +i +", volume="+_cylinder.getVolume());
			i++;
		}
	}

}
