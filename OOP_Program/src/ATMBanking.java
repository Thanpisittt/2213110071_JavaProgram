import java.io.*;
import java.util.*;
public class ATMBanking {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter account number : ");
		String accountNumber =scan.next();
		System.out.print("Enter password : ");
		String password =scan.next();
		System.out.print("Enter money : ");
		int money =scan.nextInt();
		ATMChecking bank = new ATMChecking(accountNumber,password,money);
		if(bank.checkBookBank())
		{
			bank.show();
		}
		else
		{
			System.out.print("Sorry,your account number or password or amount of money isnt enough. ");
		}
	}

}
