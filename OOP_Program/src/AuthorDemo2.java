import java.util.*;

public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] author = new Author[4];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<author.length;i++)
		{
			System.out.println("Information Author "+(i+1));
			System.out.println("------------------------");
			System.out.print("Input author name: ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail: ");
			String email = scan.nextLine();
			System.out.println("------------------------");
			author[i] = new Author(name,email);
		}
		System.out.println("");
		int i=1;
		for(Author _author : author)
		{
			
			
			System.out.println(i+". "+_author.getName()+" ("+_author.getEmail()+")");
			i++;
		}

	}

}
