package Arrays;

public class ArrayAssignmentThree {
    public static int buyAndSellstock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        /*
         * You  are  given  an  array prices where prices[i] is  
         * the  price  of  a  given  stock  on  the ith day.
         * Return the maximum profit you can achieve from this transaction. 
         * If you cannot achieve any profit, return 0.
         */
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(buyAndSellstock(prices));

    }
}
