package assignedtask;

public class MultiLevelInheritanceProgram
{
   void student()
   {
	   System.out.println("Joined in College");}  
	}  
	class College extends MultiLevelInheritanceProgram
	{  
	void branc()
	{
		System.out.println("In branch");}  
	}  
	class Department extends College
	{  
	void department1()
	{
		System.out.println("In department");
		}  
	}  
	class TestInheritance
	{  
	public static void main(String args[])
	{  
	
		Department d=new Department();  
	
		d.student();  
	
		d.branc();  
	
		d.department1();  
	}
	}  


