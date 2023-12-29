class tryCal
{
    public int cal(int ... num)
    {
	int sum = 0;
        for(int n:num)
        {
            
            sum = sum+n;            
        }
	return sum;
        
    }
    public static void main(String[] args)
    	{
        	tryCal obj= new tryCal();
        	System.out.println(obj.cal(1,3,2,4,5,6,7,8,9));
		
        }
        
    
}