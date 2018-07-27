import java.util.Scanner;
class circle
{
	void a()
	{
		Scanner input = new Scanner(System.in);
		int r;
		System.out.println("enter radius of circle");
		r = input.nextInt();

		double area;
		area = 3.14*r*r;
		System.out.println("Area of circle is "+area);

	}
}

class Main
{
	public static void main(String args[])
	{
		circle obj = new circle();
		obj.a();
	}
}
