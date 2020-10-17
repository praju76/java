/* Write a java program to accept list of file names through command line and delete the files
having extension “.txt”. Display the details of remaining files such as FileName and size. */
import java.util.*;
import java.io.*;
class Myfile
{
	Myfile(String args[])
	{
		file f;
		
	}
	void check()
	{
		for(int i=0; i<args.length;i++)
		{
			f= new File(args);
			if(f.isFile)
			{
				if(args[i].endsWith(".txt"))
				{
					f.delete();
					int cnt=0;
				}
				else
				{
					cnt=1;
				}
			}
			else
			{
				System.out.pritln("File not exists...!!");
				
			}
			if(cnt==0)
				System.out.println("all text files are deleted..");
			else
			{
				System.out.println(args[i].length());
			}
		}
	}
	
}
class slip12
{
	public static void main()
	{
		Myfile obj= new Myfile(args);
		obj.check(args);
	}
	
}
