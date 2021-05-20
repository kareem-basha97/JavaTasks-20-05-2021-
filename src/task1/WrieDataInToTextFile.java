package task1;

import java.io.FileWriter;

public class WrieDataInToTextFile
{
	public static void main(String args[])
	{    
        try
        {    
          FileWriter fw=new FileWriter("C:\\Users\\tech\\eclipse-workspace\\techjava\\javaFile.txt");    
          
          fw.write("Techouts"); 
          
          fw.write("Dev"); 
         
          fw.write("QA"); 
          
          fw.close();
          
         }
        catch(Exception e)
        {
        	System.out.println(e);
        	
        }   
        
         System.out.println("Finished");    

}
}
