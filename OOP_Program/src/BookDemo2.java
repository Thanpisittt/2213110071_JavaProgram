
import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("Input author name : ");
		String email = JOptionPane.showInputDialog("Input author email : ");
		String booktitle = JOptionPane.showInputDialog("Input book title : ");
		int check;
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		Book1 Book = new Book1(booktitle,new Author1(name,email),page);
		check = JOptionPane.showConfirmDialog(null, "is this page correct?","confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		while (check != 0) {
			Book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page,again : ")));
		check = JOptionPane.showConfirmDialog(null, "is this page correct?","confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		}
		JOptionPane.showMessageDialog(null, "Book title: "+Book.getTitle()+
				"\nAuthor name : "+Book.getAuthor().getName()+"("+Book.getPage()+" pages"+")"+
				"\nAuthor e-mail: ");
	}
}
