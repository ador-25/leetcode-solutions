class Solution {
     public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = 0, l2 = 0;
        int count =0;
        while(l1<word1.length() && l2<word2.length()){
            if (count++%2==0){
                char ch = word1.charAt(l1++);
                sb.append(ch);
            }
            else{
                char ch = word2.charAt(l2++);
                sb.append(ch);
            }
        }
        for(int i =l1;i<word1.length();i++){
            sb.append(word1.charAt(i));
        }
        
        for (int i = l2;i<word2.length();i++){
            sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}