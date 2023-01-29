class Solution {
    public int maxSubArray(int[] nums) {
        //[5,4,-1,7,8]
        //
        int cursum=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
