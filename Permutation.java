public class Permutation
{ 

    public static void search(String txt, String pat){
        int m=pat.length();
        int n=txt.length();
        System.out.println("pat length"+m);
        System.out.println("txt length"+n);
        for (int i=0;i<=n-m;i++)
        {
            String txt1=txt.substring(i,i+m);
            System.out.println(txt1);
            if (txt1.equals(pat))
            {System.out.println("find pattern at "+i);}
        }


    }
  
    /* Driver program to test above function */
    public static void main(String args[]) 
    { 
        String txt = "BACDGABCDAABCD"; 
        String pat = "ABCD"; 
        search(txt, pat); 
    } 
} 