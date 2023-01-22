package com.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KingJoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
