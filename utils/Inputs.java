package com.blz.profile.utils;

import java.util.Scanner;

public class Inputs {
    private static final Scanner sc = new Scanner(System.in);

    public static String getStringValue(){
        return sc.next();
    }
    public static int getIntValue(){
        return sc.nextInt();
    }
    public static long getLongValue(){
        return sc.nextLong();
    }
}
