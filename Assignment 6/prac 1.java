/*Write a program that creates interface.
Declare one method interest(p,r,n) in this interface and create two classes 
Simple and Compound that implements interest(p,r,n) and find simple and compound interest.
*/
interface Int
{
	public void interest(int p,int r,int n);
}

class Simple implements Int
{
	public void interest(int p,int r,int n)
	{
		int ans;
		ans = (p+r+n)/100;
		System.out.println("Simple interest is "+ans);
	}
}

class Compound implements Int
{
	public void interest(int p,int r,int n)
	{
		int ci;
		ci = p*((1+r)^n)-p;
		System.out.println("Compound interest is "+ci);
	}
}

public class Main
{
	public static void main(String args[])
	{
		Int i; 
		i = new Simple();
		i.interest(500,3,5);
		i = new Compound();
		i.interest(5,3,2);

	}
}
