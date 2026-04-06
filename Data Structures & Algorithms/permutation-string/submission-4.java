class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        for(int i=0;i<= s2.length() - s1.length(); i++){

            String window = s2.substring(i,i+s1.length());
            int[] freq = new int[26];
            for(int j = 0;j<s1.length();j++){
                freq[s1.charAt(j) - 'a']++;
                freq[window.charAt(j) - 'a']--;
            }

            boolean isPermutation = true;
            for(int count : freq){
                if(count != 0){
                    isPermutation = false;
                    break;
                }
            }
            if(isPermutation){
            return true;
            }
        }
        return false;  
    }
}
