import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int error = 0;
        int sum = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i == k){
                error = arr[i]/2;
            }
            sum+=arr[i];
        }
        int b = sc.nextInt();
        if((sum/2-error)==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(error);
        }
    }
}
