package task;

public class RunTimePolymorphism 
{
	void branch()
	{
		System.out.println("In Mech");
		}  
	}  
	class University extends RunTimePolymorphism
	{  
	void branch()
	{
		System.out.println("In CSE");
	}  
	}  
	class College1 extends RunTimePolymorphism
	{  
	void branch()
	{
		System.out.println("In Civil");
		}  
	}  

	class Test{  
	public static void main(String[] args)
	{  
	RunTimePolymorphism r;  
	r=new University();  
	r.branch();  
	r=new College1 ();  
	r.branch();    
	}
	}  

