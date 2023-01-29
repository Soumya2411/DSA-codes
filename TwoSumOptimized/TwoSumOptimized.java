package TwoSumOptimized;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public int TwoSum(int[] nums , int target){
        int[] result = new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i])){
            result[0]=i;
            result[1]=map.get(target-nums[i]);
            return result;
        }
        else{
            map.put(numbers[i],i);
        }
        
    }
    return result;
}
}
