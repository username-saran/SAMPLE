package com.resources;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
