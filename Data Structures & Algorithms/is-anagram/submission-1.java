class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        // Define an array with 26 characters
        int[] arr = new int[26];

        for(int i = 0; i < s.toCharArray().length; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        //If after all the operations the array still has 1 its not an anagram
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }

        return true;

    }
}
