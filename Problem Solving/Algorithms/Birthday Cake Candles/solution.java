// Program to count tallest candles present in the cake is created.

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

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int c = 0;
        int max = 0;;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                c = 0;
                max = arr[i];

            }if(max == arr[i]){
            c++;
            }
            
        }
        System.out.println(c);

    }
}
