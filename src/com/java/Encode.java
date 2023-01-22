package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = new String[3];
        System.out.println("Enter 3 String");
        for(int i=0;i<3;i++)
        {
            string[i]= scanner.next();
        }
        ArrayList<String> FRONT  = new ArrayList<>();
        ArrayList<String> MIDDLE  = new ArrayList<>();
        ArrayList<String> END  = new ArrayList<>();

        for(String s : string)
        {
            if(s.length()%3==0)
            {
                int limit=s.length()/3;
                FRONT.add(s.substring(0,limit));
                MIDDLE.add(s.substring(limit,limit+limit));
                END.add(s.substring(limit+limit,limit+limit+limit));
            }
            else if(s.length()%3==1)
            {
                int limit=s.length()/3;
                FRONT.add(s.substring(0,limit));
                MIDDLE.add(s.substring(limit,limit+limit+1));
                END.add(s.substring(limit+limit+1,limit+limit+limit+1));
            }
            else {
                int limit=s.length()/3;
                FRONT.add(s.substring(0,limit+1));
                MIDDLE.add(s.substring(limit+1,limit+limit+1));
                END.add(s.substring(limit+limit+1));
            }
        }

        System.out.println(FRONT+" "+MIDDLE+" "+END);

        String frt="";
        String mid="";
        String end="";

        for(String f : FRONT)
        {
            frt+=f;
        }
        for(String m : MIDDLE)
        {
            mid+=m;
        }
        for(String e : END)
        {
            end+=e;
        }

        String anend="";

        for(int i=0;i<end.length();i++)
        {
            if(Character.isUpperCase(end.charAt(i)))
            {
                anend+=Character.toLowerCase(end.charAt(i));
            }
            else{
                anend+=Character.toUpperCase(end.charAt(i));
            }
        }

        System.out.println(frt+" "+mid+" "+anend);

    }
}
