package Myprogram;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        b=sc.nextInt();
        c=addition(a,b);
        System.out.println("sum of these two numbers:"+c);
    }
    static int addition(int a,int b)
    {return a+b;
    }
}
