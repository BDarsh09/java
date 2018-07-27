1) Write a program that divides two numbers. Handle all exceptions that can be generated in this program.

import java.util.Scanner;

public class Divide {
    
    public static void main(String[] args)
    {
           Scanner input = new Scanner(System.in);
           int x = 1;
            do{
            try{
            System.out.println("enter a number");
            int n1 = input.nextInt();
            System.out.println("enter another number which u want to divide");
            int n2 = input.nextInt();
            int ans  = n1/n2;
            System.out.println("answer is "+ans);
            x = 2;
          }
          
          catch(Exception e)
          {
              System.out.println("Sorry!!!!! you can't do that");
          }
          }while(x == 1);
     }
}
