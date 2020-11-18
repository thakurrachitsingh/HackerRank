//Question-- https://www.hackerrank.com/challenges/counting-valleys/problem


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
import java.lang.String;

class Solution {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strr = sc.nextLine();
        String str = sc.nextLine();
        int count = 0;
        int down = 0;
        for(int i=0;i<str.length();i++){
            if(count==0){
                if(str.charAt(i)=="D".charAt(0)){
                    down++;
                }
            }
                if(str.charAt(i)=="U".charAt(0)){
                    count++;
                }else{
                    count--;
                }
        }
        System.out.println(down);
        
        
    }
}
