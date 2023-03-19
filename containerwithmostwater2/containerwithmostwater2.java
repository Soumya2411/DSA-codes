package containerwithmostwater2;

public class containerwithmostwater2 {
    public int maxheight(int[] height){
        int l=0,r=height.length-1;
        int min_h=0,max=0;
        while(l<r){
            min_h=Math.min(height[l],height[r]);
            max=Mth.max(max,min_*(r-l));
            if(lh<rh) l++;
            else r--;

        }
        return max;
    }
}
