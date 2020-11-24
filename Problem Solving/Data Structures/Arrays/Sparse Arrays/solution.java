//Qeuestion-- https://www.hackerrank.com/challenges/sparse-arrays/problem

//Sparse Arrays created


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strr = sc.nextLine();
        String[] str1 = new String[n];
        for(int i=0;i<n;i++){
            str1[i] = sc.nextLine();
        }
        int t= sc.nextInt();
        strr = sc.nextLine();
        String[] str2 = new String[t];
        for(int i=0;i<t;i++){
            str2[i] = sc.nextLine();
        }
        for(String a: str2){
            int count = 0;
            for(String b: str1){
                if(a.equals(b)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
