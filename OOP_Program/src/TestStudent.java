
public class TestStudent {

	public static void main(String[] args) {
		// Test construuctot and toString 
		
		Student jirapat = new Student ("Jirapat Anantasiri","1 Happy Ave");
		System.out.println(jirapat);
		//test setter getters
		jirapat.setAddress("pattanakarn 25 ");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
		
		//test addcoursegrade printgrades and getAverageGrade
		jirapat.addCourseGrade("INT 107",25);
		jirapat.addCourseGrade("INT 108",79);
		jirapat.addCourseGrade("INT 202",69);
		jirapat.printGrade();
		
		System.out.printf("The Average grade is %.2f%n",jirapat.getAverageGrade());

	}

}
