package com.java;

import java.util.Scanner;

public class SubstringFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            String str = s.substring(i,i+3);

            int n = (int) str.chars().distinct().count();
            System.out.println(str+" "+n);
            if(str.chars().distinct().count()==3)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
