class Fan
{
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	int speed;
	boolean f_on;
	double radius;
	String color;

	Fan()
	{
		speed = 5;
		f_on = false;
		radius = 7.0;
		color = "red";
	}

	Fan(int s,boolean b,double d,String c)
	{
		speed = s;
		f_on = b;
		radius = d;
		color = c;
	}

	void display()
	{
		if(!f_on)
		{
			System.out.println(speed);
			System.out.println(radius);
			System.out.println(color);
		}
		else
		{
			System.out.println(radius);
			System.out.println(color);
		}
	}

	public static void main(String args[])
	{
		Fan f1 = new Fan();
		Fan f2 = new Fan(8,true,9,"blue");
		f2.display();
	}
}


//in parameter of parameterized constructor write false instead of true to display speed of fan..
