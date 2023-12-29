import java.util.*;
class percentage
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks out of hundred for all the 5  subjects");
		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();
		float d = s.nextFloat();
		float e = s.nextFloat();
		float percentage = ((a+b+c+d+e)/500)*100;
		System.out.println("The percentage occupied is "+percentage);
	}
}
	