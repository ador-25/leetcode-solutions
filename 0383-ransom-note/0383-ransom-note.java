class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> exists = new HashMap<>();
        HashMap<Character,Integer> required = new HashMap<>();

        for (int i=0;i<magazine.length();i++){
            int oc = exists.getOrDefault(magazine.charAt(i),0);
            exists.put(magazine.charAt(i),oc+1);
        }


        for (int i=0;i<ransomNote.length();i++){
            int oc = required.getOrDefault(ransomNote.charAt(i),0);
            required.put(ransomNote.charAt(i),oc+1);
        }


        for (int i=0;i<ransomNote.length();i++){
            int need = required.getOrDefault(ransomNote.charAt(i),0);
            int found = exists.getOrDefault(ransomNote.charAt(i),0);
            if (found<need){
                return false;
            }
        }
        return true;
        
    }
}