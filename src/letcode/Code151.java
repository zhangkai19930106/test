package letcode;

import java.util.Stack;

/**
 * Created by ZK on 2017/7/17.
 *Given an input string, reverse the string word by word.
 For example,
 Given s = "the sky is blue",
 return "blue is sky the".
 */
public class Code151 {

    public String reverse(String input){
        Stack<Character> letters = new Stack<>();
        Stack<Character> words = new Stack<>();
        for (int i=0;i<input.length();i++){
            if (' '==(input.charAt(i))){
                while (!letters.isEmpty()){
                    words.add(letters.pop());
                }
                words.add(' ');
            }else {
                letters.add(input.charAt(i));
            }
        }
        while (!letters.isEmpty()){
            words.add(letters.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!words.isEmpty()){
            result.append(words.pop());
        }
        return result.toString().trim();
    }
}
