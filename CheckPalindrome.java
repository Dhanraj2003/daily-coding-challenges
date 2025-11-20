package Java_Daily_Practic.Day1;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int orgNum=num;

        int rev=0;
        if(num>0)
        {
            while(num>0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            String result=(orgNum==rev ?"Given Number is Palindrome":"Given Number is not Palindrome");  //Ternary operator
            System.out.println(result);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
