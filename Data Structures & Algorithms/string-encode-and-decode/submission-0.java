class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        //Loop through String
        int i = 0;
        while(i < str.length()){
            //Get the length
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            //i pointing to actual str
            i = j + 1;

            decodedString.add(str.substring(i, i + length));

            i += length;
        }
        return decodedString;
    }
}
