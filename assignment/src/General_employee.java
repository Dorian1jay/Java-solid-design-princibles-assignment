
public class General_employee extends person implements Iattendees{
	
	//data
	
	private String DOB;
	private String salery;
	private String jobTitle;
	
	
	
	//constructor
	public General_employee(String firstName, String lastName, String email,
			String mobileNo,String DOB, String salery, String jobTitle)
	{
		super(firstName, lastName, email, mobileNo );
		this.DOB = DOB;
		this.salery = salery;
		this.jobTitle = jobTitle;
		
	}
	// getters
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String getEmail(){return email;}
	public String getDOB() {return DOB;}
	public String getSalery(){return salery;}
	public String getJobTitle(){return jobTitle;}
	public String getMobileNo(){return mobileNo;}
	
	
	//methods
	public void sendText()
	{
		System.out.println("sending thank you message to "+ firstName +" "+ lastName + " on number : " + mobileNo );
		
	}
	
	public void sendEmail()
	{
		System.out.println("sending thank you email to "+ firstName +" "+ lastName + " at email : " + email );
	}
	
	public void listPerson()
	
	{
		System.out.println("Name : " + firstName +" " + lastName+ " - Mobile number : " + mobileNo);
	}
	
	public  String getValues()
	{
		return (firstName+", "+lastName+", "+ email +", "+ mobileNo+", "+salery+", "+jobTitle+", "+DOB);
	}

}
