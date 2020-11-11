// Program to calculate the absolute difference between the sums of diagonal of a matrix. 

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
        int result;
        int a1=0;
        int a2 = 0;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                if(i==j){
                    a1+=arr[i][j];
                }
                if(i+j==(n-1)){
                    a2+=arr[i][j];
                }
            }
            

        }
        if(a1>a2){
                result = a1-a2;
            }
            else{
                result = a2-a1;
                }
            System.out.println(result);
    }    
}
