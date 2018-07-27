//WAP that creates a custom exception InvalidAgeException which will be thrown when user enters age below 18.

import java.util.Scanner;

class validage
{
    void age(int a)
    {
        if(a<18)
        {
            throw new ArithmeticException("not a valid age");
        }
        else
        {
            System.out.println("It is a valid age");
        }
    }
}
public class Excep1 {


    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        validage obj = new validage();
        int a;
        System.out.println("enter age of a person");
        a = input.nextInt();
        obj.age(a);
    }
}

