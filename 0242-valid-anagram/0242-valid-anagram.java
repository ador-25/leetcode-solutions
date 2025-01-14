class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] m1 = new char[26];
        char[] m2 = new char[26];
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            m1[ch-97]++;
            ch = t.charAt(i);
            m2[ch-97]++;
        }

        for(int i=0;i<26;i++){
            if (m1[i]!=m2[i]){
                return false;
            }
        }

        return true;
    }

}