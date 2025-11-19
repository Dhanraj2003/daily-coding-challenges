package Java_Daily_Practic.Day1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CountEvenNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter starting index:");
        int start=sc.nextInt();

        System.out.println("Enter ending index");
        int end=sc.nextInt();

        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.println("Count of even numbers between range "+start+" to "+end+" is:"+count);
    }
}
