package task;

public class Encapsulation 
{
	private String name;  
 
	public String getName()
	{  
	
		return name;  
	}  
	
	public void setName(String name)
	{  
	
		this.name=name;  
	}  
	
}  

class TestEcapsulation
{  
public static void main(String[] args)
{   
	Encapsulation s=new Encapsulation();  
	
    s.setName("Kareem");  
 
   System.out.println(s.getName());  

}  
}  
	


