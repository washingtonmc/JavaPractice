/*
Mary Washington
Computation of the fibonacci numbers excluding 0
 */
import java.util.Scanner;
public class Fibonacci {
    public long fib (int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main (String [] args){
        Fibonacci n = new Fibonacci();
        Scanner scnr = new Scanner(System.in);
        int input;

        System.out.println("Please enter in a whole number greater than 0");
        input = scnr.nextInt();
        System.out.println(input + " fibonacci number is " + n.fib(input));
        scnr.close();
    }

}
