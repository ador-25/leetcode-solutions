class Solution {
    public int lengthOfLastWord(String s) {
        int curr = 0 ;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if (ch !=' '){
                curr++;
                continue;
            }
            if (curr!=0){
                return curr;
            }
        }
        return curr;
    }
}