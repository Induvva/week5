import java.util.Scanner;

public class Factorial {
    public class main(String[] args){
        System.out.println("Factorail");
    }
    
    public static int factorial(int n) {
        if(n==0||n==1){
            return 1;
        }
       return n*factorial(n-1);

    }
}