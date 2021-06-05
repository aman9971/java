package com.company;

import java.util.concurrent.atomic.AtomicReference;

public class cwh_question1 {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "       aman        ";
        System.out.println(nonTrimmedString.trim());


    }


}
