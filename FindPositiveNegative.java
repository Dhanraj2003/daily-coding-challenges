package Java_Daily_Practic.Day1;

import java.util.Scanner;
public class FindPositiveNegative {

    public static void main(String[] args) {

        System.out.println("Enter any number to check if it is positive or negative:");

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(num>0)
        {
            System.out.println(num+" is positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is negative number");
        }
        else{
            System.out.println(num+" is zero");
        }

        sc.close();


    }
}
