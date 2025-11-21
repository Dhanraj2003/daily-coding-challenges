package Java_Daily_Practic.Day1;
import java.util.Scanner;
public class CheckArmstrongNum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number to check it is Armstrong or not:");
        int num= sc.nextInt();

        int orgNum=num;
        int numCount=num;
        int count=0;
        int mult=1;
        int sum=0;

        while(numCount>0)
        {
            count=count+1;
            numCount=numCount/10;
        }

        while(num>0)
        {
            int rem=num%10;
            int dupCount=count;
            while(dupCount>=1)
            {
                mult=mult*rem;
                dupCount--;
            }
            sum=sum+mult;
            num=num/10;
            mult=1;
        }

        if(orgNum==sum)
        {
            System.out.println("Given Number is Armstrong Number!!!");
        }
        else {
            System.out.println("Given Number is Not Armstrong Number!!!");
        }
    }
}
