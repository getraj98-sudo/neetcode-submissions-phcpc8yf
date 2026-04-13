class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        if(t.length() != s.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(char c : arr1){
            arr[c - 'a']++;
        }
        for(char c : arr2){
            arr[c - 'a']--;
        }
        for(int i : arr){
            if(i != 0) return false;
        }

        return true;
    }
}
