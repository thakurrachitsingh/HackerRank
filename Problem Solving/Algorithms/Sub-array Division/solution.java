import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.Arrays;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(n == 1){
            if(arr[0] == m){
                System.out.println("1");
            }
        }else{

        

        
        for(int j=0;j<=(n-d);j++){
                int sum = 0;
            for(int k=j;k<(j+d);k++){
                sum+=arr[k];
            }if(sum == m){
                x++;
            }
        }
        System.out.println(x);}
    }
}
