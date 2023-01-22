package com.java;

import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        String s1,s2;
        int j=1;
        int count=1;
        for(int i=0;i<s.length()-j;i++)
        {
            s1=s.substring(0,j);
            s2=s.substring(j,j+s1.length());
            if(s1.equals(s2))
            {
                break;
            }
            else{
                count++;
            }
            j++;

        }
        System.out.println(count);
    }
}
