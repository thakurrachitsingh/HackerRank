//Question-- https://www.hackerrank.com/challenges/equality-in-a-array/problem


//Equalize the Array created


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count= 0;
            for(int a: arr){
                if(arr[i]==a){
                    count++;
                }
            }
            if(max<count){
                max = count;
            }
        }
        System.out.println(n-max);
    }
}
