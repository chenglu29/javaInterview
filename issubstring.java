
import java.util.*;

//Assume you have a method isSubstring which checks if one word is a substring of another 
//Given two strings,s1 and s2,write code to check if s2 is a rotation of s1 using only one call to 
//isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)

class issubstring{
	public static void main(String[] args){
        
        String s1="waterbottle";
        String s2="terbottlewa";
 
        System.out.println(isSubstring(s1,s2));


	}
    public static boolean isSubstring(String s1,String s2){
        boolean flag=false;
            if (s1.length()!=s2.length())
                return false;
        String s1s1=s1+s1;  //waterbottlewaterbottle
        for(int i=0;i<s1.length();i++){
            if(s2.equals(s1s1.substring(i,i+s1.length()))){
                flag=true;
            }

        }
            return flag;
        }

}

