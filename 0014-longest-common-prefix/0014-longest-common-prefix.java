class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int maxStringLength = 200; // constraint
        for(int i=0;i<maxStringLength;i++){
            char prev = ' ';
            for (int j=0;j<strs.length;j++){
                if (i>=strs[j].length()){
                    return prefix.toString();
                }
                if(j==0){
                    prev= strs[j].charAt(i);
                    continue;
                }
                
                char ch = strs[j].charAt(i);
                if (prev!=ch){
                    return prefix.toString();
                }
            }
            prefix.append(prev);
        }
        return prefix.toString();
    }
}