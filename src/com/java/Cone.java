package com.java;
import java.util.*;

public class Cone
{
    public static String genStr(int max,int pos){
        StringBuilder result = new StringBuilder();

        int len = (2*max)-2;

        result.append("-".repeat(Math.max(0, len - 2 * pos)));

        for(int i = 0; i <= pos; i++){
            result.append((char) ('a' + max - (i + 1)));
            if(pos != 0){
                result.append('-');
            }
        }

        for(int i = 0; i <= pos-1; i++){
            if(i != 0){
                result.append('-');
            }
            result.append((char) ('a' + (max - pos - 1) + (i + 1)));
        }

        result.append("-".repeat(Math.max(0, len - 2 * pos)));

        return result.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int len = (2*num)-1;
        int rlen = 0;

        String arr[] = new String[len];

        for(int i = 0; i < len; i++){
            if(i < num){
                arr[i] = genStr(num,i);
                rlen = i;
            } else {
                rlen--;
                arr[i] = genStr(num,rlen);
            }
        }

        for(String ss : arr){
            System.out.println(ss);
        }
    }
}