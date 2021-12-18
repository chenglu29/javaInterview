//Given two strings, determine if they share a common substring. A substring may be as small as one character. 


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
 
public class twoStrings {
 

    static String twoStrings(String s1, String s2) {
        String result="NO";
        Set<Character> set1 = new HashSet<Character>(); 
    //    Set<String> set2 = new HashSet<>(); 
        
     
        for (char s : s1.toCharArray()) { 
            set1.add(s); 
        } 
        

        for (int i=0;i<s2.length();i++) {
            if(set1.contains(s2.charAt(i))){ 
                result="YES";
                break;
            }
        } 
        return result;

    }
 

    public static void main(String[] args) {
       
        String s1="hello";
        String s2="wup";
        String result = twoStrings(s1, s2);
        System.out.println(result);
       
    }
}