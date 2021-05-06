package assignedtask;

public class InheritanceExample 
{
	void tech()
	{
		System.out.println("Techouts");
	}
}

class Testing extends InheritanceExample 
{
	void test()
	{
		System.out.println("QA team");
	}
}

class TestInheritence 
{
	public static void main(String[] args) 
	{

		Testing t = new Testing();

		t.test();

		t.tech();
	}

}
