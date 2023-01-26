
public class Person {
	private String firstname;
	private String lastname;

	public Person() {
		firstname = " ";
		lastname = " ";
	}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void setName(String first , String last	) {
		firstname = first;
		lastname = last;
		
	}
	public String getFirstName() {
		return firstname ; 
	}
	public String getLastName() {
		return lastname;
		
	}
	public String toString() {
			return getFirstName()+" "+getLastName();
	}
}
