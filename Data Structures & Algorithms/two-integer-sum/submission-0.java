class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int findElement = target - nums[i];
            if(map.containsKey(findElement)) return new int[]{map.get(findElement), i};
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
