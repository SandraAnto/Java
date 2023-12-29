package Demo;
class Employee1
{
    int eid;
    String eName;
    int sal;
    
    Employee1(int eid, String eName, int sal)

    {
	this.eid=eid;
	this.eName=eName;
	this.sal=sal;
    }
    
    public void setEid(int eid)
    {
        this.eid=eid;
    }
    public int getEid()
    {
        return eid;
    }
    public void setEname(String eName)
    {
        this.eName=eName;
    }
    public String getEname()
    {
        return eName;
    }
    
}
