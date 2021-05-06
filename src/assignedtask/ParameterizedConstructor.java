package assignedtask;

public class ParameterizedConstructor {
	int empid;
	
    String empname;  
      
    ParameterizedConstructor(int id,String name){  
    
    empid = id; 
    
    empname = name;  
    
    }  
     
    void display()
    {
    	System.out.println(empid+" "+empname);
    	
    }  
    
   public static void main(String args[])
   {  
	   ParameterizedConstructor s1 = new ParameterizedConstructor(111,"ravi"); 
    
	   ParameterizedConstructor s2 = new ParameterizedConstructor(222,"pawan");  
    
    s1.display();  
    s2.display(); 
   }

}
