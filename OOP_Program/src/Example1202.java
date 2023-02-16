import java.io.*;
import java.util.*;
public class Example1202 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.print("Input Section :");
			int section = input.nextInt();
			Header(section);
			showListStudent(section);
	}
 
	public static void showListStudent(int sec) throws IOException{
			BufferedReader read = new BufferedReader(new FileReader("D://2213110071_file//List107.txt"));
			String temp=" ";
			
			while((temp = read.readLine()) !=null){
				String[] data =temp.split("\t");
				double midtermScore = Double.parseDouble(data[4]);
				double finalScore = Double.parseDouble(data[5]);
				String gradeResult = findResult(midtermScore,finalScore);
				if(Integer.parseInt(data[3])==sec)
				{
					System.out.println(data[0]+" "+data[2]+"\t"+midtermScore+"\t"+finalScore+"\t"+gradeResult);
					
				}
			}

	  }
	public static void Header(int sec) {
		System.out.println("***********************************************************");
		System.out.println("\t\t\tList of Data for Section "+sec);
		System.out.println("***********************************************************");

	}
	public static String findResult(double mid,double fin) {
		double totalscore = mid + fin;
		if(totalscore<40)
		{
			return "fail";
		}
		else {
			return "pass";
		}
				

	  }
}


