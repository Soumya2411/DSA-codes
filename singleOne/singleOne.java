package singleOne;

public class singleOne {
    class Solution {
        public int singleNumber(int[] nums) {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
                    i++; //shifting becuase do digit same h
            }
            return nums[nums.length-1];
        }
    }
}
