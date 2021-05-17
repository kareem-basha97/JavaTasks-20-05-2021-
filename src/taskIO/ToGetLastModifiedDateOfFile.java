package taskIO;

import java.io.File;
import java.text.SimpleDateFormat;

public class ToGetLastModifiedDateOfFile {

	public static void main(String[] args)
	{
		File file=new File("C:\\Users\\tech\\eclipse-workspace\\techjava\\javaFile.txt");
		
		long lastModified=file.lastModified();

		System.out.println("Before format:"+lastModified);
		
		SimpleDateFormat simpleDateFormate=new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		
		String fomatedStr=simpleDateFormate.format(lastModified);
		
		System.out.println("After format:"+fomatedStr);

	}

}
