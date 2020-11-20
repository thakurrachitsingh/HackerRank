// Question-- https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

// Cats and Mouse created

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
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(Math.abs(x-z)>Math.abs(y-z)){
                System.out.println("Cat B");
            }else if(Math.abs(x-z)<Math.abs(y-z)){
                System.out.println("Cat A");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}
