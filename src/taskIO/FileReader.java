package taskIO;

import java.io.File;
import java.util.Scanner;

public class FileReader 
{
	 public static void main(String args[])throws Exception
	 {    
         File file=new File("C:\\Users\\tech\\eclipse-workspace\\techjava\\javaFile.txt");
         
         Scanner sc =new Scanner(file);
         
         while(sc.hasNext())
         {
        	 System.out.println(sc.next());
         }
   }    
}
