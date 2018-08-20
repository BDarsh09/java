//Write a program that divides two numbers. Handle all exceptions that can be generated in this program

class Excep
{
	public static void main(String[] args)
	{
		try
		{
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = a/b;
		System.out.println(c);
		}

		catch(ArithmeticException ae)
		{
			System.out.println("ERROR");
		}	
		catch(NumberFormatException ne)
		{
			System.out.println("Format ERROR");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Array ERROR");
		}
	}
}
