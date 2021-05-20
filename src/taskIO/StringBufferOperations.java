package taskIO;

public class StringBufferOperations {

	public static void main(String[] args)
	
	{
		StringBuffer sb=new StringBuffer("Tech");
		
		sb.append("Java");
		
		System.out.println(sb);
		
		sb.insert(1,"Java");
		
		sb.replace(1,3,"Java");
		
		sb.reverse(); 
		
		}

}
