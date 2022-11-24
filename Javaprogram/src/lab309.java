import java.util.Scanner;
import java.text.*;
public class lab309 {
	
	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("####.00");
		int salary, age; // to be input
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		System.out.print("Enter the monthly salary:");
		salary=scan.nextInt();
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		contributableSalary = SALARY_CEILING;
		if(salary>contributableSalary)
		{
			salary=6000;
			
		}
		
		if (age <= 55) 
		{ employeeContribution= (double)salary*EMPLOYEE_RATE_55_AND_BELOW;
		employerContribution= (double)salary*EMPLOYER_RATE_55_AND_BELOW;
			System.out.println("The employee's contribution is: $"+frm.format(employeeContribution));
			System.out.println("The employer's contribution is: $"+frm.format(employerContribution));
			totalContribution=employeeContribution+employerContribution;
			System.out.println("The total contribution is: $"+frm.format(totalContribution));
			} else if (age <= 60) { // (60, 65]
				employeeContribution= salary*EMPLOYEE_RATE_55_TO_60;
				employerContribution= salary*EMPLOYER_RATE_55_TO_60;
				
				System.out.println("The employee's contribution is: $"+frm.format(employeeContribution));
				System.out.println("The employer's contribution is: $"+frm.format(employerContribution));
				totalContribution=employeeContribution+employerContribution;
				System.out.println("The total contribution is: $"+frm.format(totalContribution));
			} else if (age <= 65) { // (55, 60]
				employeeContribution= salary*EMPLOYEE_RATE_60_TO_65;
				employerContribution= salary*EMPLOYER_RATE_60_TO_65;
				System.out.println("The employee's contribution is: $"+frm.format(employeeContribution));
				System.out.println("The employer's contribution is: $"+frm.format(employerContribution));
				totalContribution=employeeContribution+employerContribution;
				System.out.println("The total contribution is: $"+frm.format(totalContribution));
			} else { // above 65
				employeeContribution= salary*EMPLOYEE_RATE_65_ABOVE;
				employerContribution= salary*EMPLOYER_RATE_65_ABOVE;
				System.out.println("The employee's contribution is: $"+frm.format(employeeContribution));
				System.out.println("The employer's contribution is: $"+frm.format(employerContribution));
				totalContribution=employeeContribution+employerContribution;
				System.out.println("The total contribution is: $"+frm.format(totalContribution));
			}
			
		
	}

}
