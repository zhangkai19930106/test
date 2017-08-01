package letcode;

/**
 * Created by ZK on 2017/7/25.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Code014 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int length = 0;
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        do {
            length = sb.length();
            if (strs[0].length()<=0){
                return "";
            }
            if (n>=strs[0].length()){
                break;
            }
            char c = strs[0].charAt(n);
            for (int i = 1; i < strs.length; i++) {
                if (n>=strs[i].length()||c != strs[i].charAt(n)) {
                    return sb.toString();
                }
            }
            sb.append(c);
            n++;
        }while (length!=sb.length());
        return sb.toString();
    }
}
