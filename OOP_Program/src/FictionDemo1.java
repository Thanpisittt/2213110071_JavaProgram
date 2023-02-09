import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input title: ");
		String title = scan.nextLine();
		System.out.print("input year: ");
		int year = scan.nextInt();
		
		FictionBook book = new FictionBook(title,year);
		System.out.print("input Author name: ");
		String name = scan.nextLine();
		scan.nextLine();
		System.out.print("input email: ");
		String email = scan.nextLine();
		book.setAuthorName(name);
		book.setEmail(email);
		book.checkEmail();
		book.checkformatName();
		System.out.println(book);
		
		
	}

}
