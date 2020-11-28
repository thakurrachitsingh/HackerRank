//Question-- https://www.hackerrank.com/challenges/the-hurdle-race/problem


//The Hurdle Race created.

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
        int num = sc.nextInt();
        int maxJump = sc.nextInt();
        int arr[] = new int[num];
        int max = 0;
        for(int i =0;i<num;i++){
            arr[i] =sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        if(max<=maxJump){
            System.out.println(0);
        }else {
            System.out.println(max-maxJump);
        }
    }
}
