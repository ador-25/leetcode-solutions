class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] m1 = new char[256];
        for (int i=0;i<s.length();i++){
            m1[s.charAt(i)]++;
        }

        for(int i=0;i<t.length();i++){
            if (m1[t.charAt(i)]==0){
                return false;
            }
            m1[t.charAt(i)]--;
        }

        return true;
    }


}