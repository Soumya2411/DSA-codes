
class moveZero{
    public static void main(int[] nums){
        int snowball=0,t;
for(int i=0;i<nums.length;i++)
{
if(nums[i] = 0 ){
    snowball++;
}
else if{
    t=nums[i];
    nums[i]=0;
    nums[i-snowball] = t;
}
}
    }
}
