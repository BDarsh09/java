//Write a program to define abstract class, with two methods addition() and subtraction(). addition() is abstract method.
//Implement the abstract method and call that method using a program(s).

abstract class Sum 
{
	abstract void addition();
	void subtraction()
	{
		System.out.println("subtraction");
	}
}
	
class Add extends Sum
{
	void addition()
	{
		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println(c);
	}
}

public class Sumdemo
{
	public static void main(String[] args)
    {
		Sum s = new Add();
		s.addition();
		s.subtraction();	
	}
}
