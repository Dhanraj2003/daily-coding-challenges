package Java_Daily_Practic.Day1;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number:");
        int num=sc.nextInt();

        System.out.println("Multiplication table of:"+num);
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }



    }
}
