
package task;

abstract class AbstractClass 

{
   AbstractClass()
   
	{
	   System.out.println("Constructor created");
	 }  
	   abstract void run();
	   
	   void subject()
	   {
		   System.out.println("Slect subject");
		   
	   }  
	 }  
	
	 class Topic extends AbstractClass
	 {  
	 void run()
	 {
		 System.out.println("In running");
		 
	 }  
	 }  

	 class TestClass
	 {  
	 public static void main(String args[])
	 {  
		 AbstractClass obj = new Topic();  
	  
		 obj.run();  
	  
		 obj.subject();  
	 }  

}
