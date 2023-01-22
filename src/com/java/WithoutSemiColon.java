package com.java;
import java.util.*;

public class WithoutSemiColon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        n+=1;
        scanner.nextLine();
        for(int i=0;i<n;i++)
        {
            String str = scanner.nextLine();
            String[] nums = str.split(",");
            for(String s : nums)
            {
                System.out.println(s);
            }

        }

    }
}
