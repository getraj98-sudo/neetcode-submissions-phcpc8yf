class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();

        //Define HashMap that would have key as char array string and value as list
        HashMap<String, List> map = new HashMap<>();

        for(String s: strs){
            int[] arr = new int[26];
            for(char c: s.toCharArray()){
                arr[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : arr){
                sb.append("#");
                sb.append(i);
            }
            if(!map.containsKey(sb.toString())){
                map.put(sb.toString(), new ArrayList<>());
            }

            map.get(sb.toString()).add(s);
        }

        return new ArrayList(map.values());
    }
}
