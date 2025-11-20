package Java_Daily_Practic.Day1;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int temp=num;

        int rev=0;
        if(num>0)
        {
            while(num>0)
            {
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            System.out.println("Reverse Number of "+temp+" is : "+rev);
        }
        else
        {
            System.out.println("Invalid Input");
        }



    }
}
