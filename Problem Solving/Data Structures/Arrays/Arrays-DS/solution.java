//Question-- https://www.hackerrank.com/challenges/arrays-ds/problem

//Arrays-DS created.

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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=(n-1);i>=0;i--){
            arr[i] = sc.nextInt();
        }
        for(int a: arr){
            System.out.print(a+" ");
            
        }
        
    }
}
