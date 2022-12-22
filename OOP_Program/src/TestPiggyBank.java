import java.util.*;
public class TestPiggyBank {
static Scanner scan = new Scanner (System.in);
static piggybank pb = new piggybank();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* piggybank pb = new piggybank();
       pb.setPiggyBank(500);
       System.out.println("Money Total : "+pb.getTotal());
       pb.addTwo(34);
       System.out.println("Add 2 Baht Money: "+34);
       System.out.println("Money Total : "+pb.getTotal());
       pb.addTen(13);
       System.out.println("Add 10 Baht Money: "+13);
       System.out.println("Money Total : "+pb.getTotal());
       pb.addFive(100);*/
	    sizeofpiggybank();
    
	}//endofmain
public static void sizeofpiggybank() {
	 System.out.println("Money Total : " + pb.getTotal() );
	 System.out.print("please define size of piggybank : ");
	 //int size = scan.nextInt();
	 pb.setPiggyBank(scan.nextInt());
	 System.out.println("Size of your piggybank: "+pb.getpiggybank());
	 inputCoin();
}
public static void inputCoin() {
	
	while(true) {
	System.out.println("\n================");
	System.out.println("Menu of piggybank");
	System.out.println("\n================");
	System.out.println("[1] one baht");
	System.out.println("[2] two baht");
	System.out.println("[3] five baht");
	System.out.println("[4] ten baht");
	System.out.println("[5] exit");
	System.out.println("Please select the choice: ");
	int choice = scan.nextInt();
	
	if(choice == 1)
	{
		System.out.print("Insert 1 baht: ");
		pb.addOne(scan.nextInt());
		 System.out.println("Money Total : " + pb.getTotal() );
	}
	else if(choice == 2)
	{
		System.out.print("Insert 2 baht: ");
		pb.addTwo(scan.nextInt());
		 System.out.println("Money Total : " + pb.getTotal() );
	}
	else if(choice == 3)
	{
		System.out.print("Insert 5 baht: ");
		pb.addFive(scan.nextInt());
		 System.out.println("Money Total : " + pb.getTotal() );
	}
	else if(choice == 4)
	{
		System.out.print("Insert 10 baht: ");
		pb.addTen(scan.nextInt());
		 System.out.println("Money Total : " + pb.getTotal() );
	}
	else if(choice == 5)
	{
		System.out.print("Bye Bye ");
		break;
	}
	
	/*else if(choice == 5)
	{
		System.out.print("Bye Bye ");
		
	}*/
}
	}
}

