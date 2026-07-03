class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[]{-1};

        HashMap<Integer, Integer> count = new HashMap<>();
        
        //Numbers and its frequencies
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            list.add(new int[]{entry.getValue(), entry.getKey()});
        }

        list.sort((a,b) -> b[0] - a[0]);

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i)[1];
        }

        return ans;
    }
}
