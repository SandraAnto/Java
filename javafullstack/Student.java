// Online Java Compiler
// Use tois editor to write, compile and run your Java code online
import java.util.*;
class Student
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the student ID");
        String sid = s.next();
        System.out.println("Enter the student name");
        String sName = s.next();
        System.out.println("Enter the student marks");
        String marks = s.next();
        
        Student student = new Student();
        
        student.studentDetails(sid,sName,marks);
    }
    public void studentDetails(String... details)
    {
        for(String d:details)
        {
            System.out.println(d);
        }
                    
    }
}
        
        