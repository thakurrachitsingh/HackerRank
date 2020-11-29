//Question-- https://www.hackerrank.com/challenges/designer-pdf-viewer/problem


// Designer PDF created.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[26];
        int sumArea = 0;
        for(int i=0;i<26;i++){
            arr[i] = sc.nextInt();
        }
        String strrr = sc.nextLine();
        String str = sc.nextLine();
        int length = str.length();
        for(int i=0;i<length;i++){
            int ascii = str.charAt(i);
            for(int j=0;j<26;j++){
                    if(ascii == (j+97)){
                        if(sumArea<arr[j]){
                            sumArea = arr[j];
                        }
                    }
                
            }
        }
        System.out.println(sumArea*length);
    }
}
