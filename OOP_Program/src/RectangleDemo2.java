import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double width , length ;
		System.out.print("input width: ");
		width = scan.nextDouble();
		System.out.print("input length: ");
		length = scan.nextDouble();
		Rectangle2 rec = new Rectangle2(width,length);
		System.out.println(rec + "\nArea of Rectangle is "+rec.getArea());
	}

}
