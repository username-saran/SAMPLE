package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum=0;
        int count=0;
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        for (int i=0;i< points.length;i++) {
            for (int j=0 ; j < points[0].length-1;j++) {
                sum=points[i][j]+points[i][j+1];
                if(points[i][j]==points[i][j+1]){
                    count++;
                }
            }
            arr.add(sum);
            sum = 0;
        }
        int max=0;
        for(Integer i : arr){
            if(max< Collections.frequency(arr,i)){
                max=Collections.frequency(arr,i);
            }
        }
        System.out.println(Math.max(count,max));
    }
}
