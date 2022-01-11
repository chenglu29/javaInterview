
import java.util.*;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/


class stock {
	public static void main (String[] args) {
	int [] prices={7,1,5,3,6,4};
	System.out.println(maxProfit(prices));
	}
  	public static int maxProfit(int[] prices) {
        int n=prices.length;
        int maxdiff=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int diff=(prices[j]-prices[i]);
                if (diff>maxdiff)
                    maxdiff=diff;
            }
        }
        return maxdiff;
    }
}