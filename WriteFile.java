import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile 
{
	public static void main(String args[])
	{
		try 
		{
			File f1=new File("C:\\Users\\Gagan\\Desktop\\demofile.txt");
			FileWriter fw=new FileWriter(f1);
			fw.write("this is file handling class");
			fw.write("\n");
			fw.write("this is file handling class line 2");
			fw.flush();
			System.out.println("Write Completed");
			fw.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}
