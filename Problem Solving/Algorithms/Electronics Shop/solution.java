// Question-- https://www.hackerrank.com/challenges/electronics-shop/problem

//Electronics Shop created.
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyBoard = new int[n];
        int usb[] = new int[m];
        int max =0;
        for(int i=0;i<n;i++){
            keyBoard[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            usb[i] = sc.nextInt();
        }
        for(int i:keyBoard){
            for(int j:usb){
                if((i+j)>max && (i+j)<= b){
                    max = (i+j);
                }
            }
        }if(max == 0){
            System.out.println(-1);
        }else{
            System.out.println(max);
        }
    }
}
