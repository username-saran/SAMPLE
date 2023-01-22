package com.java;

import java.util.Scanner;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
