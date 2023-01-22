package com.java;

import java.util.Scanner;

public class SAMPKE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if(s.length()%3==0)
        {
            int limit=s.length()/3;
            System.out.println(s.substring(0,limit));
            System.out.println(s.substring(limit,limit+limit));
            System.out.println(s.substring(limit+limit,limit+limit+limit));
        }
        else if(s.length()%3==1)
        {
            int limit=s.length()/3;
            System.out.println(s.substring(0,limit));
            System.out.println(s.substring(limit,limit+limit+1));
            System.out.println(s.substring(limit+limit+1,limit+limit+limit+1));
        }
        else {
            int limit=s.length()/3;
            System.out.println(s.substring(0,limit+1));
            System.out.println(s.substring(limit+1,limit+limit+1));
            System.out.println(s.substring(limit+limit+1));
        }
    }
}
