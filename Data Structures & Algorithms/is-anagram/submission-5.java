class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }


        for(char ch : mp1.keySet()){
            if(!mp1.get(ch).equals(mp2.get(ch))){
                return false;
            }
        }
        return true;
    }
}
