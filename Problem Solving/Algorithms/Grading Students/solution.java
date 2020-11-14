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

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();
        int arr[] = new int[numOfStudent];
        for(int i =0;i<numOfStudent;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>=38){
                if(arr[i]%5 >=3){
                System.out.println(arr[i]-(arr[i]%5)+5);
            }
            else{
                System.out.println(arr[i]);
            }}else{
                System.out.println(arr[i]);
            }
            
        }
    }
}
