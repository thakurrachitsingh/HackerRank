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
        int[] arr = new int[n-1];
        int x = 0;
        int y = 0;
        int min = sc.nextInt();
        int max = min;
        for(int i=0;i<(n-1);i++){
            arr[i] =sc.nextInt();
        }
        for(int k: arr){
            if(k>max){
                x++;
                max=k;
            }else if(k<min){
                y++;
                min = k;
            }
        } 
        System.out.println(x+" "+y);
    }
}
