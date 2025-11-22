package Java_Daily_Practic.Day1;

import java.util.Scanner;

public class ArmstrongNumCheck {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check:");
        int num=sc.nextInt();
        int orgNum=num;
        int count=String.valueOf(num).length();
        int sum=0;

        while(num>0)
        {
            int rem=num%10;
            sum+=Math.pow(rem,count);
            num/=10;
        }

        String result=(orgNum==sum?"Given Number is Armstrong!":"Given Number is Not Armstrong!");
        System.out.println(result);

    }
}
