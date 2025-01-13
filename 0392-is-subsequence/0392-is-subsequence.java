class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()){
            return false;
        }
        if (s.length()==0){
            return true;
        }
        int slowRunner =0;
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if (ch == s.charAt(slowRunner)){
                slowRunner++;
            }
            if (slowRunner == s.length()){
                return true;
            }
        }
        return false;
    }
}