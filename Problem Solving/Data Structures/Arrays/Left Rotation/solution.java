//Question-- https://www.hackerrank.com/challenges/array-left-rotation/problem

//Left Rotation created

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

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<t;j++){
            int temp = arr[0];
        for(int i=0;i<(n-1);i++){ 
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
