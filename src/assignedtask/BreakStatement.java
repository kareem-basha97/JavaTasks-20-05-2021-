package assignedtask;

public class BreakStatement {

	public static void main(String[] args) 
	{
		  int num =1;
		  
	      while(num<=15)
	      {
	          System.out.println("Value of variable is: "+num);
	          
	          if (num==2)
	          {
	             break;
	          }
	          num++;
	      }
	      
	      System.out.println("Out of while-loop");


	}

}
