
public class guest extends person implements Iattendees{
	//data
	
	
	private String contact;
	private String company;
	
	
	//  Guest constructor
	public guest(String firstName, String lastName, String email, 
			String mobileNo, String contact, String company)
	{
		super(firstName, lastName, email, mobileNo );			
		this.contact = contact;
		this.company = company;
		
	}
	
	// getters
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String getEmail(){return email;}
	public String getMobileNo(){return mobileNo;}
	public String getContact(){return contact;}
	public String getCompany(){return company;}
	
	
	 // Methods 
	public void sendText()
	{
		System.out.println("sending thank you message to "+ firstName +" "+ lastName + " on number : " + mobileNo );
		
	}
	
	public void sendEmail()
	{
		System.out.println("sending thank you email to "+ firstName +" "+ lastName + " at email : " + email );
	}
	
	public void listPerson()
	// displays a persons name and mobile no.	
	{
		System.out.println("Name : " + firstName +" " + lastName+ " - Mobile number : " + mobileNo);
	}
	

	public  String getValues()
	{
		return (firstName+", "+lastName+", "+ email +", "+ mobileNo+", "+contact+", "+company);
	}

}
