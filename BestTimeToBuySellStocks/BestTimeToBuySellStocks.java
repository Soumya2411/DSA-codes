//[7,1,5,6,3,4]
class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0],max=0;
       for(int price:prices)
       {
          min=Math.min(min,price);//minimum nikale hi array aur particular object me
          max=Math.max(max,price-min);        //max profit yani 0 se profit bda ho to usliye max nikale                                         
       }
       return max;

    }
}