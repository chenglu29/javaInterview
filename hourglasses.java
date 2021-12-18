import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hourglasses {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
           //ROw
            int sum=-1000;
            for(int i =0 ; i<4;i++){
                for(int x =0 ; x<4; x++){
                    
                    int top = arr[i][x]+arr[i][x+1]+arr[i][x+2];
                    int middle = arr[i+1][x+1];
                    int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
                    if(top+middle+bottom>sum){sum=top+middle+bottom;}
                   // System.out.println(sum);
                }
            }
            return(sum);
            
            
        

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        for (int i=0;i<6;i++)
            for (int j=0;j<6;j++){
                  System.out.println(arr[i][j]);
            } 
      
        System.out.println(hourglassSum(arr));
 
    }
}
