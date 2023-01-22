package com.java;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int n=gcd(a,b);
        System.out.println("GCD = "+n);
        System.out.println("LCM = "+(a*b)/n);
    }
}
