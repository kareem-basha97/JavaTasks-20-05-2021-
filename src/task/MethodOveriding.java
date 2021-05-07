package task;

public class MethodOveriding 
{
  
	void marriage()
	{
		System.out.println("Love Marriage");
		
	}  
		
}  
		  
class Function extends MethodOveriding
		{  
		     void marriage()
		  
		 {
			  System.out.println("Arranged Marriage");
			  
		  }  
		  
		  public static void main(String args[])
		  
		  { 
			  
			  Function obj = new Function(); 
		  
		  obj.marriage(); 
		  
		  }  
		}  


