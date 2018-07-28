interface p1
{
	void display1(int a);

}
interface p2
{
	void display2(int a);

}
interface p extends p1,p2
{
	void display3(int a);

}
interface p12 extends p
{
	void display4(int a);
}
class Main implements p12
{
	public void display1(int a)
	{
		System.out.println("value is "+a);
	}
	public void display2(int a)
	{
		System.out.println("value is "+a);
	}
	public void display3(int a)
	{
		System.out.println("value is "+a);
	}
	public void display4(int a)
	{
		System.out.println("value is "+a);
	}
	public static void main(String[] args)
	{
		p12 obj = new Main();
		obj.display1(4);	
		obj.display2(5);
		obj.display3(7);
		obj.display4(9);
	}

}
