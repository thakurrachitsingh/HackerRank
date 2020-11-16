import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            hm.put(arr[i],i);
        }
        int x=0;

        for(int i: hm.keySet()){
            int c = 0;
            for(int j=0;j<n;j++){
                if(i == arr[j]){
                    c++;
                }
            }
            int xx = c/2;
            x+=xx;
        }
        System.out.println(x);


    }
}
