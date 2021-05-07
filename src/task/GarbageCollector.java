package task;

public class GarbageCollector 
{

	public static void main(String[] args)
	{

		GarbageCollector c = new GarbageCollector();
		
		c = null;
		
		System.gc();

	}
	
	public void finalize() {
		
		System.out.println("Garbage collected");
		
	}

}
