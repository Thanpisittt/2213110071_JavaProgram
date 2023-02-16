import java.io.*;
import java.util.*;
public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber, String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://2213110071_file//ATMBookBank.txt"));
		String temp=" ";
		boolean check =false;
		
		while((temp = read.readLine()) !=null){
			String[] data =temp.split("\t");
			int balance = Integer.parseInt(data[2]);
			if(data[0]==super.getID()&&data[1]==super.getPass()&&balance>=this.money)
			{
				check = true;
				
			}
			else {
				check = false;
			}
			}
		read.close();
		return check;
		
	}
	public void show() throws IOException  {
		BufferedReader read = new BufferedReader(new FileReader("D://2213110071_file//ATMBookBank.txt"));
		String temp=" ";
		int balance = 0;
		while((temp = read.readLine()) !=null){
			String[] data =temp.split("\t");
		 balance = Integer.parseInt(data[2]);
			
			}
		System.out.println("You drawing for "+this.money%2f+", get");
		int thou =1000;
		int fhun =500 ; 
		int hun =100;
		thou%=this.money;
		fhun%=(this.money%thou);
		hun%=((this.money%thou)%fhun);
		System.out.println("1000 = "+thou);
		System.out.println("500 = "+fhun);
		System.out.println("100 = "+hun);
		System.out.println("Your balance is : "+balance+(this.money-balance));
	
	}
}
	

