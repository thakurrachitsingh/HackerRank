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
    int s = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();
    int app = 0;
    int oran = 0;
    int apple[] = new int[m];
    int orange[] = new int[n];
    for(int i =0;i<m;i++){
        apple[i] = (a+sc.nextInt());
        if(apple[i]>= s && apple[i]<=t){
            app++;
        }
    }
    for(int j=0;j<n;j++){
        orange[j]= (b+sc.nextInt());
        if(orange[j]>=s && orange[j]<=t){
            oran++;
        }
    }
    System.out.println(app);
    System.out.println(oran);
    }
}
