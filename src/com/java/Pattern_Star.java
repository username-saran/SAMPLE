package com.java;

import java.util.Scanner;

public class Pattern_Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            System.out.println(res+"*");
           // res+="* ";
        }
    }
}
