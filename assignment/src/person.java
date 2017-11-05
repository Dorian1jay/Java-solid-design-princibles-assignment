
public class person
// base class 
{
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String mobileNo;
	
	//base class constructor for general employee, guest and contractor. 
	
	public person(String firstName, String lastName, String email, 
			String mobileNo)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

}
