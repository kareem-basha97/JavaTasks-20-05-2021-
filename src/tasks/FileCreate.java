package tasks;

import java.io.File;
import java.io.IOException;

public class FileCreate 
{
public static void main(String args[])
{
	try
	{
	
    File file =new File("javaFile.txt");
    
    if(file.createNewFile())
    {
    	System.out.println("File is created");
    }
    else
    {
    	System.out.println("File is already created");
    }
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
}
