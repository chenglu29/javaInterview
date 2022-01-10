package interview;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		char str[]=new char[11];
		str[0]='p';
		str[1]='r';
		str[2]='o';
		str[3]='g';
		str[4]='r';
		str[5]='a';
		str[6]='m';
		str[7]='m';
		str[8]='i';
		str[9]='n';
		str[10]='g';

		
		int len=str.length;
		System.out.println(len);
		
		int index=0;
		for (int i=0;i<len;i++)
		{
			int j;
			for (j=i+1;j<len;j++) {
				if(str[i]==str[j]) {
					str[j]=0;
				}
			}
			
		}
		
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		System.out.println(str[6]);
		System.out.println(str[7]);
		System.out.println(str[8]);
		System.out.println(str[9]);
		System.out.println(str[10]);
	}
}
