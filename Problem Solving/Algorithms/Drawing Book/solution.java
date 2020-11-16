import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n =sc.nextInt();
        int page = sc.nextInt();
        int total = n/2;
        int pageToTurn = page/2;
        if(total>page){
            System.out.println(pageToTurn);
        }else if(total<page){
            System.out.println(total-pageToTurn);
        }else if((total/2)==pageToTurn){
            System.out.println(pageToTurn);
        }else{
            System.out.println(0);
                    }
    }
}
