/*
Mary Washington
Computing factorials
*/

import java.util.Scanner;

public class Factorial {

        public long fact(int n){
            if(n==0||n==1){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
        public static void main(String[] args) {
            Factorial n = new Factorial();
            Scanner scnr = new Scanner(System.in);
            int input;
            System.out.println("Please enter in a non-negative number");
            input=scnr.nextInt();
            System.out.println(input + "! is " + n.fact(input));
        }
}