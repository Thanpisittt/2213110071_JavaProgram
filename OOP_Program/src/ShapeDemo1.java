import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("input radius: ");
		double radius = scan.nextDouble();
		System.out.print("input height: ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,null);
		System.out.println("Circle[radius = " +circle.getRadius()+"]"+"\nCircle[area = "+circle.getArea());
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Cylinder[height = "+cylinder.getHeight()+",radius="
		+cylinder.getRadius()+"]"+"\nCylinder[area ="+cylinder.getArea()+"]"+"\nCylinder[volume="+cylinder.getVolume()+"]");
	}

}
