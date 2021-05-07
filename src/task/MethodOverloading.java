package task;

public class MethodOverloading 
{
    static void add()
   {
	   System.out.println("In default method");
   }
    public static void add(int i)
    {
 	   System.out.println("In int add methiod");
    }
    public static void add(double d)
    {
 	   System.out.println("In double add methiod");
    }
    public static void add(int i,double d)
    {
 	   System.out.println("In int and double add methiod"+i);
    }
   
	public static void main(String[] args) 
	{
		add();
		add(100);
		add(172.2);

	}

}
