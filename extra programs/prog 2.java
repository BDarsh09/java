import java.util.Scanner;
class Avg
{
	void a()
	{
		Scanner input = new Scanner(System.in);
		int A[];
		A = new int[4];
		
		System.out.println("enter array");
		A[0] = input.nextInt();
		System.out.println("enter array");
		A[1] = input.nextInt();
		System.out.println("enter array");
		A[2] = input.nextInt();
		System.out.println("enter array");
		A[3] = input.nextInt();
		
		int avg = (A[0]+A[1]+A[2]+A[3])/4;
		System.out.println("average is "+avg);
	}
	
}

public class Main
{
	public static void main(String args[])
	{
		
		Avg obj = new Avg();
		obj.a();
	}
}
