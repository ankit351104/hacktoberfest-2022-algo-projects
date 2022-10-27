class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class Test
{
	public static void check(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			System.out.println("Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String [] args){
		try
		{
			check();
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("Caught the exception");
		}
		System.out.println("rest of code....");
	}
}