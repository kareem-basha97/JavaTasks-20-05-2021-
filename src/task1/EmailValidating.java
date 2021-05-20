package task1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidating 
{
	public static void main(String args[])
	{  
        ArrayList<String> emails = new ArrayList<String>();
        
        emails.add("kareem@domain.co.in");  
        
        emails.add("sumanth@domain.com");  
        
        emails.add("bharath.name@domain.com");  
        
        emails.add("@yahoo.com");
        
        emails.add("tech#domain.com");  
 
        String regex = "^(.+)@(.+)$";  
 
        Pattern pattern = Pattern.compile(regex);  

        for(String email : emails)
        {  

            Matcher matcher = pattern.matcher(email);  
            
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  

}
