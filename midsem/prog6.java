//Write a program to demonstrate the multipath inheritance for the classes having relations as shown in figure.

interface A 
{
	public void name();
}
interface B extends A 
{
	public void surname();
}
interface C extends A
{
	public void rollno();
}
interface D extends B,C   
{
	public void enroll();
}

class Demo implements D
{
	public void name()
	{
		System.out.println("darshil");
	}
	public void surname()
	{
		System.out.println("bavishi");
	}
	public void rollno()
	{
		System.out.println("16it041");
	}
	public void enroll()
	{
		System.out.println("160470116002");
	}
}

public class Inf
{
    public static void main(String[] args)
	{
		Demo obj = new Demo();
		obj.name();
		obj.surname();
		obj.rollno(); 	
		obj.enroll();
	}
}


	


