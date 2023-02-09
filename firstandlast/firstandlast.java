package firstandlast;

public class firstandlast {
    public int[] searchRange(int[] nums, int target) {
int []ans={-1,-1};
for(int i=0;i<nums.length;i++){
    if(nums[i]==target){
        ans[0]=i;
        while(i<nums.length&&nums[i]==target){
            a[1]=i;
            i++;
        }
        break;
    }
}    
return ans;
}
