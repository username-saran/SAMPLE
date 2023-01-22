package com.java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
