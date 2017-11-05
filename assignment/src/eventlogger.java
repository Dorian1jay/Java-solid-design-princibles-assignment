import java.util.ArrayList;

//ArrayList class
public class eventlogger 
{
	
	static ArrayList<Iattendees> eventLog = new ArrayList<Iattendees>();
	
	
	





	public static void printlist()
	{
	//displays a list of names and numbers of people attending.

	for (int i  = 0;i < eventLog.size(); i++)
		{
			Iattendees tmp = eventLog.get(i);
			tmp.listPerson();			
		
		}
	}
	
	public static void thankyouMessage()
	{
	//displays a list of names and numbers of people attending.

	for (int i  = 0;i < eventLog.size(); i++)
		{
			Iattendees tmp = eventLog.get(i);
			tmp.sendEmail();
			tmp.sendText();
		
		}
	}
	
	public static void writetofile()
	{
	//displays a list of names and numbers of people attending.

	for (int i  = 0;i < eventLog.size(); i++)
		{
			Iattendees tmp = eventLog.get(i);
			writetofile.write(tmp);			
		
		}
	}
	
	
	

}