public class BestTimeBuySellStock {
    
    public static void main(String[] args) {

        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};
 
        BestTimeBuySellStock.maxProfit(arr1);
 
     //    System.out.println(BestTimeBuySellStock.maxProfit(arr1));
        //System.out.println(BestTimeBuySellStock.maxProfit(arr2));
         // System.out.println("Hello world!");
         // System.out.println("sheesh");
     }
 
    public static int maxProfit(int[] prices) {
 
        int highest = 0;
        int lowest = prices[0];
 
        String oldString = " fadfa f";
 
        int start = 0;
 
        for (int i = 0; i < prices.length; i++) {
 
            if ((prices[i] <= lowest) ) {
                start = i;
                lowest = prices[i];
            }
        }
 
 
        int lowestVal = prices[start];
        int highestIndex = 0;
        for (int i = start; i < prices.length; i++) {
 
         //System.out.println(i);
             if (prices[i] > highest) {
                 highestIndex = i;
                 highest = prices[i];
             
 
             }
             System.out.println(highest);
        }
 
 
 
     //    System.out.println(lowest);
 
     
        return highest - lowestVal;
 
    }
 
}
