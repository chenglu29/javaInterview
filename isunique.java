//implement an algorithm to determine if a string has all unique characters
class isunique{
public static boolean isUnique(String str){
	if(str.length()>256) return false;
	boolean[] char_set=new boolean[256];
	for(int i=0;i<str.length();i++)
	{
		int val=str.charAt(i);
		if(char_set[val])
			return false;
		char_set[val]=true;
	}
	return true;
}
public static void main(String[] args)
{
	
	System.out.println(isUnique("abcc"));
}
}