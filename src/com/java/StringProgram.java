package com.java;

import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String s="";
        for(char ch : str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                sum=sum*10+(ch-'0');
            }
            if(Character.isAlphabetic(ch))
            {
                for(int i=0;i<sum;i++)
                {
                    s+=ch;
                }
                sum=0;
            }
        }
        System.out.println(s);

    }
}
