package Demo;
import java.util.*;
import Demo.Employee1;
class MainClass
{
	public static void main(String a[])
	{	Scanner s= new Scanner(System.in);
		
		Employee1 em[]=new Employee1[5];
		for(int i=0;i<3;i++)
		{
			
			Employee1 e= new Employee1();
			System.out.println("Enter the  eID");
			
			e.eid= s.nextInt();
			System.out.println("Enter the eName");
			
			e.eName=s.next();
			System.out.println("Enter the Sal");
			
			e.sal=s.nextInt();
			
			em[i]= e;
		}	
		
	}
	
}