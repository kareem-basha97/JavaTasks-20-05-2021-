package task;

interface InterfaceClass 
{
   void movie();
	
	}  
	class Movies implements InterfaceClass
	{  
	 public void movie()
	 {
		 System.out.println("Hello");
		 
	 }  
	  
	public static void main(String args[])
	
	{  
		InterfaceClass obj = new Movies();  
	    
		obj.movie();  
	 
}  
	}  

