class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[]sourceMap =  new int[256];
        int[]destMap =  new int[256];

        for( int i=0;i<s.length();i++){
            sourceMap[s.charAt(i)]++;
        }
        for( int i=0;i<t.length();i++){
            destMap[t.charAt(i)]++;
        }

        for(int i=97;i<=122;i++){
            if(sourceMap[i]!=destMap[i]){
                return false;
            }
        }
        return true;

    }
}