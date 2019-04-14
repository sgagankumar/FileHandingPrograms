import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String args[])
	{
		File f1=new File("C:\\Users\\Gagan\\Desktop\\demofile.txt");
		try 
		{
			boolean b1=f1.createNewFile();
			if(b1==true)
				System.out.println("File Created");
			else
				System.out.println("File already exists");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}
