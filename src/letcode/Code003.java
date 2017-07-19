package letcode;

/**
 * Created by ZK on 2017/7/19.
 * Given a string, find the length of the longest substring without repeating characters.
 Examples:
 Given "abcabcbb", the answer is "abc", which the length is 3.
 Given "bbbbb", the answer is "b", with the length of 1.
 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Code003 {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;
        int end = 1;
        if (s.length()==1){
            return 1;
        }
        while (end < s.length()){
            int length = end - start;
            String str = s.substring(start,end);
            if (str.contains(s.charAt(end) + "")){
                start = start + str.indexOf(s.charAt(end)) + 1;
            }else {
                length++;
            }
            end++;
            result = Math.max(length,result);

        }
        return result;
    }
}
