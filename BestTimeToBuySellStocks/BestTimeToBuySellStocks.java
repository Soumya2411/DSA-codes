//[7,1,5,6,3,4]
class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0],max=0;
       for(int price:prices)
       {
          min=Math.min(min,price);
          max=Math.max(max,price-min);                                                 
       }
       return max;

    }
}