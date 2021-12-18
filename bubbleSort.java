// Java program to find minimum number of 
// characters to be removed to make two 
// strings anagram. 
import java.util.*; 
  
class bubbleSort { 
  
    // function to calculate minimum numbers 
    // of characters to be removed to make 
    // two strings anagram 
    static void countSwaps(int[] a) {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    
        }
        System.out.println("First Elements:"+a[0]);
        System.out.println("Last Elements:"+a[n-1]);


    }
 
    // Driver program to run the case 
    public static void main(String[] args) 
    { 
        int[] a={3,2,1,5,4};
        countSwaps(a);
        for(int i:a)
            System.out.println(i);
    } 
} 