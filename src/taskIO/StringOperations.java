package taskIO;

public class StringOperations {

	public static void main(String[] args) 
	{
		String s="javadev";
		
		String s2="JAVA123";
		
		String s1=s.replace('j', 'a');
		
		String s3=s2.replaceAll("[0-9]", " ");
		
		System.out.println(s3);
        
		String s4=s.toUpperCase();
		
		String s5=s2.toLowerCase();
		
		System.out.println(s4);
		
		System.out.println(s5);
		
		System.out.println(s.startsWith("ava"));
		
		System.out.println(s.endsWith("java"));
		
		System.out.println(s.contains("ava"));
	}

}
