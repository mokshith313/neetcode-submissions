class Solution {
    public boolean isPalindrome(String s) {
        String ans = Alphanum(s);
        int left =0;
        int right =ans.length()-1;
        while(left < right){
            if(ans.charAt(left) != ans.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static String Alphanum(String s){
        StringBuilder ans = new StringBuilder();
        String str = s.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)>='a' && str.charAt(i) <='z') || (str.charAt(i)>='0' && str.charAt(i)<='9')){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
