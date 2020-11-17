// Question--  https://www.hackerrank.com/challenges/sherlock-and-squares/problem.

//Sherlock and Squares created


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
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            int sqrOfA = (int)Math.ceil(Math.sqrt(a));
            int sqrOfB = (int)Math.floor(Math.sqrt(b));
            System.out.println(sqrOfB-sqrOfA+1);
        }
    }
}
