
class Manager extends Employee
{
    String depart;
    
    Employee(int id, String name, int sal, String dept)

    {
	super(int id, String name, int sal, String dept);
	dept=depart;
    }
    
    public void setdept(String dept)
    {
        dept=depart;
    }
    public String getdept()
    {
        return dept;
    }
   
    
}
