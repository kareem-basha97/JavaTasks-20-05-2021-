package task1;

import java.io.File;

public class CheckFileHiddenOrNot {

	public static void main(String[] args)
	{
	File file=new File("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\techjava\\\\javaFile.txt");
	
	if(file.isHidden())
	{
		System.out.println("file is hidden");
	}
	
	else
	{
	System.out.println("file is not hidden");

	}
	
	}
}
