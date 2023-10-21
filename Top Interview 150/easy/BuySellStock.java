import java.lang.Math;

public class BuySellStock {
    public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        BuySellStock new1 = new BuySellStock ();

        // initialize array
        int[] prices = {7,6,4,3,1};

        // call and print function result
        int result = new1.maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[curr] > prices[i]) {
                curr = i;
            }
            max = Math.max(max, prices[i] - prices[curr]);
        }
        return max;
    }
}
