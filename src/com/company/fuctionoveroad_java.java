package com.company;
class Fuctiontest
{
    void sum1(int a , int b){
            int d = a + b;

        System.out.println("function 1 = " +d);
    }
    void sum2(int e , int f , int g){
            int h = e+f+g;

        System.out.println("function 2 = " +h);
    }


}

public class fuctionoveroad_java {
    public static void main(String[] args) {
        Fuctiontest ob = new Fuctiontest();
        ob.sum1(2,3);
        ob.sum2(2,4,6);


    }
}
