class Solution {
   public static String minWindow(String s, String t) {

     if(s.length() < t.length()){
            return "";
        }


        HashMap<Character,Integer> have = new HashMap<>();
        for(char ch : t.toCharArray()){
            have.put(ch,have.getOrDefault(ch,0)+1);
        }

        int left =0;
        int minLen=Integer.MAX_VALUE;
        String ansString ="";
        int formed =0;
        HashMap<Character,Integer> seen = new HashMap<>();

        for(int right = 0;right<s.length();right++){

            char ch = s.charAt(right);

            if(have.containsKey(ch)){
                seen.put(ch,seen.getOrDefault(ch,0)+1);

                 if(seen.get(ch).intValue() == have.get(ch).intValue()){
                formed++;
              }
            }


            while(formed == have.size()){
                int currLen = right-left+1;
                if(currLen < minLen){
                    ansString = s.substring(left,right+1);
                    minLen = currLen;
                }
                char ch1 = s.charAt(left);
                if(seen.containsKey(ch1)) {
                    seen.put(ch1, seen.get(ch1) - 1);
                    if(seen.get(ch1) < have.get(ch1)){
                        formed--;
                    }
                }
                left++;
            }
        }
        return ansString;
    }
}
