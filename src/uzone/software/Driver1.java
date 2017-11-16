package uzone.software;

import java.util.ArrayList;
import uzone.people.*;

public class Driver1 
{
	
	public static void main(String[] args) 
	{
		UZoneGUI newGUI;
		UZone zone1 = new UZone();
		UZone zone2 = null;
		ArrayList<Student> studentList = new ArrayList<>();

		// Create People	//
	    
		// Set Admins
		Admin a1 = new Admin();
		Admin a2 = new Admin();
		Admin a3 = new Admin();
		
		// Set Students
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		
		// Initialize	//
		a1.setName("Justin");
		a1.setEmail("justin@gmail.com");
		a1.setNetID("justinloera");
		a1.setPassword("21savage");
		a1.setSQ("25");
		
		a2.setName("Grayson");
		a2.setEmail("grayson@gmail.com");
		a2.setNetID("grf7");
		a2.setPassword("trackstar");
		a2.setSQ("50");
		
		a3.setName("Tommy");
		a3.setEmail("tommy@gmail.com");
		a3.setNetID("tsalanski");
		a3.setPassword("imasenior");
		a3.setSQ("75");
		
		s1.setName("John");
		s1.setEmail("john@gmail.com");
		s1.setNetID("johnny123");
		s1.setPassword("appleseed");
		s1.setSQ("1");
		
		s2.setName("Bob");
		s2.setEmail("bob@gmail.com");
		s2.setNetID("bobby123");
		s2.setPassword("orangejuice");
		s2.setSQ("2");
		
		s3.setName("Jim");
		s3.setEmail("jim@gmail.com");
		s3.setNetID("jimmy123");
		s3.setPassword("slimjim");
		s3.setSQ("3");
		
		zone1.addAdmin(a1);
		zone1.addAdmin(a2);
		zone1.addAdmin(a3);
		
		zone1.addStudent(s1);
		zone1.addStudent(s2);
		zone1.addStudent(s3);
		
	    System.out.println("\t\tBefore Serialization:");
		zone1.printAll();
			
	    UZone.saveData(zone1);
		
	    System.out.println("\n\n\n\t\tPost Serialization:");

	    zone2 = UZone.loadData();
	    zone2.getStudents().get(0).setName("Peter");
	    zone2.getStudents().get(0).setEmail("peter@gmail.com");
	    zone2.getStudents().get(0).setNetID("peter123");
	    
	    zone2.printAll();
	    
		
    	
	}

}
