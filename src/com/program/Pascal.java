package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> l1=new ArrayList<>();
        int num = sc.nextInt();
        int sum=1;
        for(int i=0;i<num;i++){
            List<Integer> l2=new ArrayList<>();
            l2.add(sum);
            if (i>0){
                for(int j=0;j<l1.get(i-1).size()-1;j++){
                    int k=j+1;
                    l2.add(l1.get(i-1).get(j) + l1.get(i-1).get(k));
                }
                l2.add(sum);
            }
            l1.add(l2);
        }
        System.out.println(l1);
    }
}
