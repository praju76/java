import java.util.*;
import java.io.*; 
class Reverse
{
	int i,n;
	String name,path;
	Scanner s=new Scanner(System.in);
	Reverse()
	{
		System.out.print("Enter File Name: ");
		name=s.nextLine();
		System.out.print("Enter File Path: ");
		path=s.nextLine();
	}
	void reverse() throws IOException
	{
		File f=new File(name);
		FileInputStream fin=new FileInputStream(f);
		if (!f.exists()|| f.isDirectory())
		{
			System.out.print("AageSeRightAndFuckOff");
		}
		else
		{
			n=fin.read();
			for(i=0;i<-1;i++)
			{
				
			}
		}
	}
}
class TestReverse
{
	public static void main(String args[]) throws IOException
	{
		Reverse obj=new Reverse();
		obj.reverse();
	}
}
