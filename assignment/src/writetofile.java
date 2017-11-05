import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writetofile {

	//writes attendees to a file 

	public static void write(Iattendees tmp) {

	 FileWriter fwrite = null;
	 PrintWriter pwrite = null;
	  
	    try {
	        fwrite = new FileWriter("attendees.txt",true);
	        pwrite = new PrintWriter(fw);

	    pw.write(tmp.getValues()+"\n");
	        pwrite.close();
	        fwrite.close();
	    } catch (IOException ex) {
	    	 System.err.println("Problem writing to the file ");	       
	    }
	    
	}

   
}
	


