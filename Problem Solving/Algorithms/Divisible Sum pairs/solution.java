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
        int k = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<(n-1);j++){
            for(int m=(j+1);m<n;m++){
                if((arr[j]+arr[m])%k == 0){
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
