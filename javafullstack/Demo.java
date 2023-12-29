

import java.util.*;

public class EmployeeService 
{
	Employee EmployeeList[]=new Employee[10];

	public void intiEmployeeList()
	{
		for(int i=0;i<10;i++)
		{
			EmployeeList[i]= new Employee((100+(i+1)),"Employee"+(i+1), 10000+(i+1),"Department"+(i+1));
		}

	}

	public Employee findEmployee(int eid)
	{
		Employee emp = null;
		for(int i =0;i<employeeList.length;i++)
		{
			if(employeeList[i]!=null)
			{
				if(employeeList[i].getEid() == eid)
				{
					emp=employeeList[i];
				}
			}
		}
		return emp;

	}

	public Employee findEmployee(int eid)
	{
		Employee emp=findEmployee(employee.getEid());

		if (emp == null)
		{
			employeesList[employeesList.length-1]=employee;
		}
		else
		{
			System.out.println("Employee Already Exist");
		}
		return employeeList;
	} 

	public Employee updateEmployee(int eid,String eName, String dept)
}

 