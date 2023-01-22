package com.resources;

import java.util.HashMap;
import java.util.Map;

public class Repeat {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] num = {1,2,3,4,5,6,7,7,8,9,9,3,2,1,2,3};
        for(int i : num)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println((Integer)entry.getKey());
            }
        }
    }
}
