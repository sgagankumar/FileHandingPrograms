import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile 
{
	public static void main(String args[])
	{
		try 
		{
			File f1=new File("C:\\Users\\Gagan\\Desktop\\demofile.txt");
			FileReader fr=new FileReader(f1);
			int len=(int)f1.length();
			char[] c1=new char[len];
			fr.read(c1);
			System.out.println(c1);
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}
