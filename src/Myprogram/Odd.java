package Myprogram;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter a number:");
        Scanner inp=new Scanner(System.in);
        i=inp.nextInt();

        if (i%2==1)
            System.out.println("The given Number is Odd:");
        else
            System.out.println("The given Number is Even");


    }




}
