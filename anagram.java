
import java.util.*;



class anagram {
public static void main (String[] args) {
	String a ="abc";
	String b="cba";

	char []c=a.toCharArray();
	Arrays.sort(c);

	char []d=b.toCharArray();
	Arrays.sort(d);
		System.out.println(a);


	String e=Arrays.toString(c);
	System.out.println(e);

	System.out.println(String.valueOf(c).equals(String.valueOf(d)));
//	System.out.println(String.valueOf(d));
//	System.out.println(Arrays.toString(c).equals(Arrays.toString(d));

//	System.out.println(sort(a)==sort(b));
	}
}