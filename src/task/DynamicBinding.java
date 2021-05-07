package task;

public class DynamicBinding
{
	void book()
	{
		System.out.println("Student reading book");
		}  
	}  
	  
	class Student extends DynamicBinding
	{  
	 void book()
	 {
		 System.out.println("Another one reading book");
		 }  
	  
	 public static void main(String args[])
	 {  
		 DynamicBinding d=new Student(); 
		 
	     d.book();  
	 }  
	} 

	


