package assignedtask;

public class AgregationProgram 
{     
	String authorName;
	  int age;
	  String place;

	  AgregationProgram(String name, int age, String place)
	  {
	    this.authorName = name;
	    this.age = age;
	    this.place = place;
	  }
	}

	class  Book
	{
	  String name;
	  int price;
	  AgregationProgram auther;
	  Book(String n, int p, AgregationProgram auther)
	  {
	    this.name = n;
	    this.price = p;
	    this.auther = auther;
	  }
	  public static void main(String[] args) 
	  {
		  AgregationProgram auther = new AgregationProgram("John", 42, "USA");
	    Book b = new Book("Java for Begginer", 800, auther);
	    System.out.println("Book Name: "+b.name);
	    System.out.println("Book Price: "+b.price);
	    System.out.println("Auther Name: "+b.auther.authorName);
	    System.out.println("Auther Age: "+b.auther.age);
	    System.out.println("Auther place: "+b.auther.place);
	  }
	  
	}


