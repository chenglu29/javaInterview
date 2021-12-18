
import java.util.Arrays;
class toys {
//Maximise the number of toys that can be purchased with amount K

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum=0;
        int number=0;
/*        for (int i=0;i<prices.length;i++)
        {
            System.out.println(prices[i]);
        }*/
        for(int i=0;i<prices.length;i++)
        {
            if(sum+prices[i]<=k){
                sum+=prices[i];
                System.out.println("sum"+sum);
                number++;
                System.out.println("number"+number);
            }
            else{
                break;
            }
        }
        return number;

    }


    public static void main(String[] args)  {
       
       
    	int[] prices={1,5,9,10,12,12,50,100};
    	int k=50;
       maximumToys(prices,k);

       
    }
}
