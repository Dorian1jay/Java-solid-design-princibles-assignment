


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// creating guests of different types 
		General_employee ge1 = new General_employee("Bob","Smith","bob@company.com","0891234567","24/12/1982","40,000","manager");
		General_employee ge2 = new General_employee("tom","johnson","tom@company.com","083234353","13/04/1962","66,000","C.T.O.");
		Contractor con1 = new Contractor
		("Jimmy", "Smith", "Jimmy@contractor.com", "087465213","16/02/1990", "Bob Smith", "JimmyCo");
		Contractor con2 = new Contractor
		("Timmy", "Hendrix", "Timmy@contractor.com", "087465213", "11/06/1962", "Bob Smith", "TimmyCo");
		guest g1 = new guest("Doug","Stanhope","Doug@email.com","0893334444","Bob smith","JokesRus");
		guest g2 = new guest("Stan","Hopeful","Stan@email.com","0887776666","tom johnson","megacorp");
		
		
		//put into event class 
		// adding Attendees to eventLog 
		eventlogger.eventLog.add(ge1);
		eventlogger.eventLog.add(ge2);
		eventlogger.eventLog.add(con1);
		eventlogger.eventLog.add(con2);
		eventlogger.eventLog.add(g1);
		eventlogger.eventLog.add(g2);
		
		

		// database
		sqliteDB db1 = new sqliteDB();
		
		
		//adding to an Database 
				
		db1.insertGE(ge1);
		db1.insertGE(ge2);
		db1.insertCON(con1);
		db1.insertCON(con2);
		db1.insertGU(g1);
		db1.insertGU(g2);
		
		
		db1.close();
		
		
		// print's a list of names and numbers of attendees
		eventlogger.printlist();
		// prints thank you message for phone and email
		eventlogger.thankyouMessage();
		// writes attendees to a text file
		eventlogger.writetofile();

	}

}
