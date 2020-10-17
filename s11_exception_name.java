import java.util.*;
class DigitException extends Exception

class Employee
{
	string name;
	Employee()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=s.nextLine();
	}
	
	void validate()
	{
		try 
		{
			if(name.isDigit())
				throw DigitException();
			else
			{
				System.out.println("Entered name is valid..");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
