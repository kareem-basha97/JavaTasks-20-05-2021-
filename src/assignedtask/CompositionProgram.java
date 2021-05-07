package assignedtask;

public class CompositionProgram 
{

		private String name;

		  private int id;

		  public void student()

		  {

		    System.out.println("Student id= "+id + " name= " + name);

		  }

		  public void setName(String name)

		  {

		    this.name = name;

		  }

		  public void setId(int id)

		  {

		    this.id = id;

		  }

		}
		class Student1 extends CompositionProgram{
			

		  public void setStart()

		  {

		    Student1 e = new Student1();

		    e.setStart();

		  }

		}
		class College

		{

		  public void start()

		  {

		    System.out.println("Class started.");

		  }

		  public void completed()

		  {

		    System.out.println("class completed");

		  }

		}
		 class Composition

		{

		  public static void main(String[] args)

		  {

			  Student1 h = new Student1();

		    h.setName("Black");

		    h.setId(160);

		    h.setStart();

		  }

		}


	


