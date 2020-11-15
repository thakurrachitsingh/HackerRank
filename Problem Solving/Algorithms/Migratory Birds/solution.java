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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = sc.nextInt();
        int max=0;
        int x = 0;
        int[] ar = new int[n];
        int[] arr = new int[n];
        int k = 0;
        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                hm.put(arr[i],i);   
        }
        for(int q: hm.keySet()){
            int count = 0;
            for(int j=0; j<n;j++){
                if(q == arr[j]){
                    count++;
                }
            }
            if(max<count){
                max = count;
                x=q;
            }
            
        }
        System.out.println(x);
        
    }
}
 
