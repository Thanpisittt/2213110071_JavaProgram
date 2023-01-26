import java.util.*;
public class Bookdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("input author name: ");
		String name = scan.nextLine();
		System.out.print("input author email: ");
		String email = scan.nextLine();
		Author1 auth = new Author1(name,email);
		System.out.println(auth);
		
		System.out.println();
		
		System.out.print("Input book name: ");
		String title = scan.nextLine();
		System.out.print("Input book page: ");
		int page = scan.nextInt();
		
		Book1 bk1 = new Book1(title,auth,page);
		System.out.println();
		System.out.println(bk1);
		
	}

}
