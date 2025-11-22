package Java_Daily_Practic.Day1;
import java.util.Scanner;
public class CountDigit {

    public static void main(String[] args) {

        System.out.println("Enter any Number:");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        while(num>0)
        {
            int rem=num%10;
            count++;
            num=num/10;
        }

        System.out.println("Total digit in given number is:"+count);

    }
}
