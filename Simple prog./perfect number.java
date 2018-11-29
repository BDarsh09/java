public class PerfectNumber {

    public void checkPerfect(int num){
        int d = 1;
        for(int i = 2; i <= num/2; i++)
            if(num % i == 0)
                d += i;

        if(d == num) {
            System.out.print("Given number " + num + " is a perfect number.");
        }else {
            System.out.print("Given number " + num + " is not a perfect number.");
        }
    }

    public static void main(String [] args){
        PerfectNumber p = new PerfectNumber();
        p.checkPerfect(28);
    }
}
