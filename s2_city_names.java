import java.util.*;
class City
{
	//declarationOfArray
	String a[];
	int n;
	City()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("how many cities you want: ");
		n=s.nextInt();
		
		//RedeclarationOfArray
		a=new String[n];
		
		//AcceptValues
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Element Number {i+1}: ");
			a[i]=s.next();
		}
	}
	//Display
	
	void display()
	{
		String temp="";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted cities are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
//CreateObject
class TestCity
{
	public static void main(String[] args)
	{
		City obj= new City();
		obj.display();
	}
}
