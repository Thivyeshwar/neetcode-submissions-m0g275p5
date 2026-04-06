class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freq = new int[26];
        
        for(char ch : s1.toCharArray()){
            freq[ch - 'a']++;
        }

        int left = 0;
        for(int right = 0; right <s2.length();right++){

            freq[s2.charAt(right) - 'a']--;

            if(right - left +1 > s1.length()){
                freq[s2.charAt(left) - 'a']++;
                left++;
            }

            if(allZeros(freq)) return true;
        }
        return false;
    }
    public static boolean allZeros(int[] freq){

        Boolean isPermutation = false;
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
