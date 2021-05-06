package assignedtask;

public class StaticKeyword {

	static int a = 30;
	
    static void kareem()
    {
		  System.out.println("In static method");
		 
    }
		 
    public static void main(String[] args)
    {
		  StaticKeyword.kareem();
		  
		  System.out.println(StaticKeyword.a);
		 
		  StaticKeyword S1 = new StaticKeyword();
	
		  System.out.println(S1.a);
		  
		  System.out.println(a);
		  
		 
    }

}
