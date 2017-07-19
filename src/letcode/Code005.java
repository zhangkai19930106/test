package letcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZK on 2017/7/19.
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 */
public class Code005 {

    private int location,maxLength;

    public String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        for (int i=0;i<s.length()-1;i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return s.substring(location,location+maxLength);
    }

    private void palindrome(String s,int j,int k){
        while (j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if (maxLength < k-j-1){
            location = j+1;
            maxLength = k-j-1;
        }
    }

}
