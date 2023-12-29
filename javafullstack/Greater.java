
import java.util.*;
class Greater
{
	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int ar[]= new int[5];
		int i;
		
		for(i=0; i<5; i++)	
			ar[i]=s.nextInt();
		
		int max1=ar[0];
		
		for (i=1;i<ar.length;i++)
		{
			if(ar[i]>max1)
				max1=ar[i];
		}
		System.out.println(max1+ "is the greatest number of all");

	}
}
			
			