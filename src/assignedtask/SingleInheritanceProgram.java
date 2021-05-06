package assignedtask;

public class SingleInheritanceProgram 
{
   void work()
   {
	   System.out.println("Do work");}  
	} 

	class Company extends SingleInheritanceProgram
	{  
	void employee()
	{
		System.out.println("Task");
	}  
	}  
	class Test
	{  
	public static void main(String args[])
	{  
	Company c=new Company();
	c.work();  
	c.employee();  
	}
	}  


