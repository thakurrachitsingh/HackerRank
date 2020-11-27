//Question-- https://www.hackerrank.com/challenges/picking-numbers/problem

//Picking Numbers created.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int max = 0;
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            int count = 0;
            int count2 = 0;
            for(int j=0;j<num;j++){
                
                    if(arr[i]-arr[j]<=1 && arr[i]-arr[j] >=0){
                        count++;
                    }else if(arr[j]-arr[i]<=1 && arr[j]-arr[i]>=0){
                        count2++;
                    }
                
            }
            if(max<count || max<count2){
                max = count>count2?count:count2;
            }
        }
        System.out.println(max);
    }
}
