package com.java;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PatternLike {
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
        LinkedHashSet<Integer> factors = new LinkedHashSet<>();
        int n;
        n=scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int g = arr[0];
        for(int i=0;i<n;i++)
        {
            g = gcd(arr[i],g);
        }
        for(int i=1;i*i<=g;i++)
        {
            if(g%i==0){
                factors.add(i);
                if(g/i!=i)
                {
                    factors.add(g/i);
                }
            }

        }
        System.out.println(factors);

    }
}
