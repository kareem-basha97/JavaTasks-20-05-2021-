package task1;

import java.util.regex.Pattern;

public class RegularExpressionWithDot 
{
	public static void main(String args[])
	{  
		System.out.println(Pattern.matches(".k", "ak")); 
		
		System.out.println(Pattern.matches(".k", "mk"));
		
		System.out.println(Pattern.matches(".k", "mkt"));
		
		System.out.println(Pattern.matches("..k", "ammk"));
		
		System.out.println(Pattern.matches("..k", "mak"));		}
}
