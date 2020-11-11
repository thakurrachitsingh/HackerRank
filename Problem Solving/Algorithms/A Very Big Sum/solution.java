// Program to print sum of long integer elements of Array 

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
        long sum = 0;
        long[] arr = new long[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for(long j:arr){
            sum+=j;
        }
        System.out.println(sum);

    }
}
