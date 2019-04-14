import java.io.File;

public class CreateFolder 
{
	public static void main(String args[])
	{
		File f1=new File("C:\\Users\\Gagan\\Desktop\\Folder");
		if(f1.exists()==false)
		{
			f1.mkdir();
			System.out.println("Folder Created");
		}
		else
		{
			System.out.println("Folder Already Exists");
		}
	}
}
