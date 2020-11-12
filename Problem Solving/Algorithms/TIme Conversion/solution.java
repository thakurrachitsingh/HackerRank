// Program to convert time format from 12 hour format to 24 hour format.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        String maradian = time.substring(8,10);
        hour-= (maradian.equals("AM")&&(hour == 12))?12:0;
        hour+= (maradian.equals("PM")&&(hour != 12))?12:0;
        System.out.println(String.format("%02d",hour)+":"+String.format("%02d",minute)+":"+String.format("%02d",second));
    }

}
