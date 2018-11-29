import java.lang.*; 
  
public class Test { 
  
    public static void main(String args[]) 
    { 
        StringBuffer sbf = new StringBuffer("Darshil"); 
        System.out.println("String buffer = " + sbf); 
          
        // Here it reverses the string buffer 
        sbf.reverse(); 
        System.out.println("String buffer after reversing = " + sbf); 
    } 
} 
