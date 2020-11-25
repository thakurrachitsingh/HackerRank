//Question-- https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem


//Jumping onthe clouds created

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
        int[] arr = new int[n];
        int x=0;
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i==0){}
            else if(i%2==x){
                if(arr[i]==0) count++;
                else {
                    if(i%2==0){
                        count++;
                        x=1;
                    }else if(i%2!=0){
                        count++;
                        x=0;
                    }
                }
            }
        }
        if(x==1  && (n-1)%2==0){
            count++;
        }else if(x==0 && (n-1)%2!=0){
            count++;
        }
        System.out.println(count);
        
    }
}
