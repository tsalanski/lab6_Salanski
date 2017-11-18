package uzone.name;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	private String complaint;

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	
}
