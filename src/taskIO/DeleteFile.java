package taskIO;

import java.io.File;
import java.io.IOException;

public class DeleteFile
{
	public static void main(String args[])
	
	{
		File file=new File("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\techjava\\\\deleteFile.txt");
		
		try
		{
		if(!file.exists())
		{
			if(file.createNewFile())
			
				System.out.println("file is created successfully");
		}
		if(file.delete())
		{
			System.out.println("file got deleted");
		}
		else
			
		{
			System.out.println("file not deleted");

		}
		}
		catch(IOException e)
		{
			System.out.println(e);

		}
	}
}

