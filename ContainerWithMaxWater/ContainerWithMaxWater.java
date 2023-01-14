class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0,min=0,ind=0;

        while(i<j){
             min=Math.min(height[i],height[j]);
             ind=j-i;
            // System.out.println(max);
             if(max<(min*ind)){
                 max=min*ind;
             }
             if(height[i]>=height[j]){
                 j--;
             }
             else{
                 i++;
             }
        }
        return max;
    }
}