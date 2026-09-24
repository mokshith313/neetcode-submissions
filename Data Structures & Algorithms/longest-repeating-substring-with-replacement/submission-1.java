class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left =0;
        int maxfreq =0;
        int maxlen =0;
        for(int right =0; right < s.length(); right++){
            int index = s.charAt(right)-'A';
            count[index]++;

            maxfreq = Math.max(maxfreq, count[index]);
            while((right - left +1)- maxfreq > k){
                count[s.charAt(left) -'A']--;
                left++;
            }
            maxlen = Math.max(maxlen, (right - left +1));
        }
        return maxlen;
    }
}
