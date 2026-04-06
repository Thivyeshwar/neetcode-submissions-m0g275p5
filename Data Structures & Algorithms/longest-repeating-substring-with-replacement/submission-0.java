class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];
        int left =0;
        int maxWindow = 0;
        int maxFreq = 0;

        for(int right = 0; right<s.length();right++){
            
            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);

            int windowSize = right - left +1;

            int change_ch = windowSize - maxFreq;
            if(change_ch > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowSize = right - left + 1;
            maxWindow = Math.max(maxWindow,windowSize);
        }
        return maxWindow;
    }
}
