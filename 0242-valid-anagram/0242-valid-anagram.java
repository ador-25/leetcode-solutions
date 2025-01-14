class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] m1 = new char[256];
        char[] m2 = new char[256];
        for (int i=0;i<s.length();i++){
            m1[s.charAt(i)]++;
            m2[t.charAt(i)]++;
        }

        for(int i='a';i<'z';i++){
            if (m1[i]!=m2[i]){
                return false;
            }
        }

        return true;
    }


}