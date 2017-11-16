package uzone.people;

import java.util.ArrayList;
import java.io.Serializable;


public class Admin extends Person implements Serializable
{

	private static final long serialVersionUID = 4829138739191305872L;
	
	
	private ArrayList<String> Complaints;
	
	
	public Admin()
	{
		// Empty Constructor
	}
	
	
	public ArrayList<String> getComplaints()
	{
		return this.Complaints;
	}
	
	public void addComplaint(String complaint)
	{
		this.Complaints.add(complaint);
	}
	
	public void removeStudent(Student student)
	{
		
	}
	
	public void addNews()
	{
		
	}
	
	
	public Boolean isAdmin()
	{
		return true;
	}

}
