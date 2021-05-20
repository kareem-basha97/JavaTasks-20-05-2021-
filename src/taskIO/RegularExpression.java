package taskIO;

import java.util.regex.Pattern;

public class RegularExpression 
{
	public static void main(String args[])
	{  
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));  
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));  
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));  
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));  
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949")); 
		  
		  
		}
}
