import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class leftrotation {

public static void leftRotate(int arr[], int n, int k)
{
    int[]b=new int[n];
    for(int i=0;i<n;i++){
        b[i]=arr[(i+k)%n];
    }
    for (int j:b){
        System.out.println(j);
    }
}

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	int d=3;
        int[] a={1,2,3,4,5};
        leftRotate(a,5,2);

   
 
    }
}
