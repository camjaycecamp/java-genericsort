
public class OCCCPerson  extends RegisteredPerson
implements Comparable<OCCCPerson>
{
	private String studentID;
	
	
	public OCCCPerson(RegisteredPerson p, String studentID) 
	{
		super(p);
		this.studentID = studentID;
	}
	
	public OCCCPerson(OCCCPerson oP)
	{
		super(oP.getFirstName(), oP.getLastName(), oP.getGovernmentID());
		this.studentID = oP.getStudentID();
	}
	
	
	public String getStudentID() 
	{
		return studentID;
	}
	
	
	public boolean equals(OCCCPerson p) 
	{
		return getFirstName().equalsIgnoreCase(p.getFirstName()) &&
	             getLastName().equalsIgnoreCase(p.getLastName()) &&
	             getGovernmentID().equalsIgnoreCase(p.getGovernmentID()) &&
	             studentID.equalsIgnoreCase(p.studentID);
	}
	
	public boolean equals(RegisteredPerson p) 
	{
		return getFirstName().equalsIgnoreCase(p.getFirstName()) &&
	             getLastName().equalsIgnoreCase(p.getLastName()) &&
	             getGovernmentID().equalsIgnoreCase(p.getGovernmentID());
	}
	
	public boolean equals(Person p) 
	{
		return getFirstName().equalsIgnoreCase(p.getFirstName()) &&
	             getLastName().equalsIgnoreCase(p.getLastName());
	}
	
	public String toString() 
	{
		return super.toString() + " [" + studentID + "]";
	}
	
	// added compareTo method for generic insertion sort compatibility
	@Override
	public int compareTo(OCCCPerson o) 
	{
		if(this.equals(o))
		{
			return 0;
		}
		else 
		{
			if(this.getStudentID().length() > o.getStudentID().length()) 
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
}
