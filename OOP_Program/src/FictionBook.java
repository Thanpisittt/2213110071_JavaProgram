import java.time.Year;

public class FictionBook implements Author2,book2 {
	private String author_name;
	private String email;
	private String title;
	private int publicyear;
	public FictionBook(String title ,int publicYear) {
		this.title = title;
		this.publicyear = publicYear;
		
	}
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public boolean checkformatName() {
		if(this.author_name.trim().contains(" "))
		{
			return true;
		}
		else return false ; 
	}
	@Override
	public String getLastName() {
		int index = this.author_name.lastIndexOf(" ");
		return this.author_name.toUpperCase().substring(index+1);
	}
	@Override

	public String getFirstName() {
		int index = this.author_name.lastIndexOf(" ");
		return this.author_name.toUpperCase().substring(0,index);
	}
	@Override

	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com"));
		{
			return true;
		
		}
	}
	@Override
	public int totalPublicyear() {
		return Year.now().getValue()-this.publicyear;
	}
	

	public String getTitle() {
		return this.title;
	}
	public String toString() {
		return this.title+"write by " + getLastName().substring(0)+"."
	+getFirstName()+"("+this.email+")"+"publised for " +totalPublicyear()+" years." ; 
	}
	
}
