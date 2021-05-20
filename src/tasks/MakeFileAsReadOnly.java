package tasks;

import java.io.File;

public class MakeFileAsReadOnly {

	public static void main(String[] args) 
	{
		File file=new File("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\techjava\\\\deleteFile.txt");
		
		boolean flag=file.setReadOnly();
		
		if(flag==true)
		{
			System.out.println("File set as read only");
		}
     
		else
		{
			System.out.println("File is not set as read only");
		}
		

	}

}
