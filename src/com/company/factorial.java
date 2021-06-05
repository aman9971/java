package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        int i = 1;
        int f = 1;
        while (i <= num)
        {
            f = f * i;
            i++;
        }
        System.out.println("factorial of " + num + " = " + f);
    }
}
