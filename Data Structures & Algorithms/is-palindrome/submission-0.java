class Solution {
    public boolean isPalindrome(String s) {
        
        boolean flag = true;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }
        String s1 = sb.toString();
        s1 = s1.toLowerCase();
        

        int i=0;
        int j= s1.length()-1;

        if(s1.isEmpty()){
            return true;
        }

        while(i < j){

            if(s1.charAt(i) != s1.charAt(j)){
                 return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
