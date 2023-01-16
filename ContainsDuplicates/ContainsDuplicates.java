class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for (int idx = 0; idx < nums.length; idx ++){
            // Searches hashset. if present, it contains duplicate...
            if (hset.contains(nums[idx])){
                return true;
            }
            // if not present it will update hashset...
            hset.add(nums[idx]);
        }
        // Otherwise return false...
        return false;
    }

}
