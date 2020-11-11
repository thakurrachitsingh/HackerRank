//Comparing elements of one Array to the other

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
        int[] a = new int[3];
        int[] b = new int[3];
        int a1=0;
        int b1=0;
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++){
            b[j]=sc.nextInt();
            if(a[j]>b[j]){
                a1++;
            }
            else if(a[j]<b[j]){
                b1++;
            }
            else{

            }
        }
        System.out.println(a1+" "+b1);
    }
}
