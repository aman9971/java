package com.company;
import java.util.*;

public class reversal{

        public static void main(String[] args){
            int reverse = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter any number");
            int num = sc.nextInt();
            for(;num != 0;) //123
            {
                int remainder = num%10;  // 3
                reverse = reverse*10 + remainder;// 0 = 0*10 + 3 = 3
                num = num/10; // 123 / 10 = 12
            }
            System.out.println("reverse" + reverse);

        }
    }