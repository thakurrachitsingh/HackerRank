//print decimal value upto 6 place

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
        double neg = 0;
        double pos = 0;
        double zer = 0;  
        int[] b = new int[n];
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            if(i==0){
                zer++;                 
            } 
            else if(i<0){
                neg++;
            }
            else{
                pos++;
            }

        }
        System.out.println(String.format("%6f",(pos/n)));
        System.out.println(String.format("%6f",(neg/n)));
        System.out.println(String.format("%6f",(zer/n)));

    }
}
