class Solution {
    public int[] productExceptSelf(int[] nums) {
                if(nums.length == 1) return nums;
        
        // Find the left product array
        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        int leftTotal = 1;
        for(int i = 1; i < nums.length; i++){
            leftTotal = leftTotal * nums[i - 1];
            leftArr[i] = leftTotal;
        }

        // Find the right product array
        int[] rightArr = new int[nums.length];
        rightArr[nums.length - 1] = 1;
        int rightTotal = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            rightTotal = rightTotal * nums[i + 1];
            rightArr[i] = rightTotal;
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = leftArr[i] * rightArr[i];
        }

        return ans;
    }
}  
