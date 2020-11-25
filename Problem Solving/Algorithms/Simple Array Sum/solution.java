//Question-- https://www.hackerrank.com/challenges/simple-array-sum/problem

// Sum of elements of Array in Java

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int[] arr = new int[num];
        for(int i = 0; i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
            sum+=j;
        }
        System.out.println(sum);

    }
}
