import java.util.*;
import java.io.*;
class Reverse_case
{
	int i;
	String ch, st;
	Scanner s= new Scanner(System.in);
	Reverse_case() throws IOException
	{
		System.out.println("Enter String:	");
		ch=s.nextLine();
	}
	void game_on() throws IOException
	{
		File f= new File("ruu");
		FileInputStream fin=new FileInputStream("ruu");
		char c[]=ch.toCharArray();
		for(i=0;i<ch.length();i++)
			System.out.print(c[i]);
		fin.close();
	}
	
}
class Test_reverse
{
	public static void main(String args[]) throws IOException
	{
		Reverse_case rs = new Reverse_case();
		rs.game_on();
	}
}
