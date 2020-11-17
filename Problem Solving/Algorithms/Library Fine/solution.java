//Question--  https://www.hackerrank.com/challenges/library-fine/problem?h_r=next-challenge&h_v=zen

//Program to calculate library fine is created.


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
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(y1>y2){
            System.out.println(10000);
        }else if(y1<y2){
            System.out.println(0);
        }else if(m1>m2){
            System.out.println(500*(m1-m2));
        }
        else if(m1<m2){
            System.out.println(0);
        }else if(d1>d2){
            System.out.println(15*(d1-d2));
        }else{
            System.out.println(0);
        }
        
    }
}
