import java.util.*;
class Hash
{
	int n,i,sal;
	String name;
	Scanner s =new Scanner(System.in);
	void accept()
	{
			System.out.print("Enter Name	:	");
			name =s.nextLine();
			System.out.print("Enter Salary	:	");
			sal=s.nextInt();
	}
	void display()
	{
		System.out.print("Name	  :	"+name);
		System.out.println("	Salary  :	"+sal);
	}
}
class Testmyhash
{
	public static void main(String args[])
	{
		int i,n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter How many employees: ");
		n=s.nextInt();
		Hash obj1=new Hash();
		Hashtable <Integer, Hash> ha= new Hashtable <Integer, Hash>();
		for(i=0;i<n;i++)
		{
			Hash obj=new Hash();
			obj.accept();
			ha.put(i,obj);
		}
		for(i=0;i<n;i++)
		{
			obj1=ha.get(i);
			obj1.display();
		}
		
	}
}
