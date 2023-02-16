import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("D://2213110071_file//employee.txt"));
		String answer;
		do {
			super.Header();
			System.out.print("Enter name");
			name= console.next();
			System.out.print("Enter dept");
			dept= console.next();
			//write all data ot file
			ps.println(name+"\t"+dept);
			System.out.print("enter data again? ");
			answer = console.next();
			
		}while(answer.equalsIgnoreCase("y"));
	}//insert()method
	

	public void read() {
		try {
			Scanner in = new Scanner(new File("D://2213110071_file//employee.txt"));
			int i =0;
			boolean check = false;
			super.Header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept()))
				{
					i++;
					System.out.println(i+")"+name);
					check = true;
				}
			}//while
			if(check) {
				super.Header();
				System.out.print("\nEmployee in department "+super.getDept()+" is "+i+" person.");
			}
			else {
				System.out.print("sorry, no department: "+super.getDept()+"in file.");
			}
			in.close();
		}
		catch(IOException e){
			System.out.print("sorry,flie not found...");
			
		}
	}
}
