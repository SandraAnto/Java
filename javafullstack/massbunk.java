Class massbunk
{
	
	void attendance(String...s)
	{
		System.out.println("The number of students are: "+s.length);
	
		for(String name:s)
		{
			System.out.println(name);
			if(name==0)
			{
				System.out.println("Mass Bunk");
			}
			else
			{
				System.out.println("total are: "+s.length);
			}

			
		}
	public static void main(String[] args)

	{
		massbunk bunk = new massbunk()
		bunk.attendance("aaa","bbb","ccc")
		
	}
}
	
