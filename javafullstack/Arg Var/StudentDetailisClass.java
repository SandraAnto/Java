import java.util.*;
class StudentDetailisClass
{
	String id;
	String name;
	String mark;
	
	StudentDetailisClass(){}

	StudentDetailisClass(String id,String name,String mark)
	{
		this.id=id;
		this.name=name;
		this.mark = mark;
	}
	
	public String toString()
	{
		return id+" "+name+" "+mark;
	}

	public void studentDetails(StudentDetailisClass... details)
	{
		for(StudentDetailisClass d:details)
		{
    			System.out.println(d);
		}
	}	
	
	public static void main(String a[])
	{
		
		Scanner s = new Scanner(System.in);
		StudentDetailisClass studentDetailis[] = new StudentDetailisClass[5];
		for(int i=0;i<3;i++)
		{	
			System.out.println("Enter the Student ID");
			String sid = s.next();
			System.out.println("Enter the Student Name");
			String sName = s.next();
			System.out.println("Enter the Student Marks");
			String marks = s.next();

			StudentDetailisClass student = new StudentDetailisClass(sid,sName,marks);
			
			studentDetailis[i] = student;
		}
		
		System.out.println(studentDetailis);
		
		StudentDetailisClass studentarr = new StudentDetailisClass();
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetailis[0]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetailis[0],studentDetailis[1]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetailis);
		
	}
	
	
}
















