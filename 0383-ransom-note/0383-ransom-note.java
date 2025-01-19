class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> exists = new HashMap<>();

        for (int i=0;i<magazine.length();i++){
            int oc = exists.getOrDefault(magazine.charAt(i),0);
            exists.put(magazine.charAt(i),oc+1);
        }


        for (int i=0;i<ransomNote.length();i++){
            if(!exists.containsKey(ransomNote.charAt(i)))
                return false;
            int oc = exists.get(ransomNote.charAt(i));
            exists.put(ransomNote.charAt(i),oc-1);

            if (oc-1==0){
                exists.remove(ransomNote.charAt(i));
            }
        }
        return true;

    }
}