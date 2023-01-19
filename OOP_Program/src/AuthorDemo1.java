import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input author name: " );
		String name = scan.nextLine();
		System.out.print("input author e-mail: " );
		String email = scan.nextLine();
		System.out.print("input author gender: " );
		char gender = scan.nextLine().toLowerCase().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.println(author);

	}

}
