package com.java;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.next();
        String number2 = scanner.next();

        System.out.println(lsum(number1,number2));
    }

    private static String lsum(String number1, String number2) {
        if(number1.length()>number2.length())
        {
            String temp = number1;
            number1=number2;
            number2=temp;
        }
        int n1=number1.length();
        int n2=number2.length();

        String str="";

        number1=new StringBuilder(number1).reverse().toString();
        number2=new StringBuilder(number2).reverse().toString();

        int carry=0;
        for(int i=0;i<n1;i++)
        {
            int sum = ((int)number1.charAt(i)-'0'+(int)number2.charAt(i)-'0'+carry);
            str += (char)(sum%10+'0');
            carry = sum/10;
        }
        for(int i=n1;i<n2;i++)
        {
            int sum = ((int)number2.charAt(i)-'0' + carry);
            str += (char) (sum%10 + '0');
            carry=sum/10;
        }

        if(carry>0)
        {
            str+=(char)(carry+'0');
        }

        str = new StringBuilder(str).reverse().toString();

        return  str;
    }
}
