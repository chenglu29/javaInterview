
import java.util.*;

//Write a method to replace all spaces in a string with ‘%20’

class replace{
	public static void main(String[] args){
		String s="abc def ghi";
		char[] str=s.toCharArray();
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<str.length;i++){
			if(str[i]==' ')
				sb.append("%20");
			else
				sb.append(str[i]);
			

		}

		
			System.out.print(sb.toString());
		
	}
}

