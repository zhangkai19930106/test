package letcode;

/**
 * Created by ZK on 2017/7/24.
 * Implement atoi to convert a string to an integer.
 * 题目要求很难理解，最终经过多次试验，得出以下几点：
 * 1.第一个非空的字符必须是‘+’或‘-’或直接从数字开始，否则一概视为非法输入，返回0。
 * 2.‘+’和‘-’之后必须紧跟数字，否则视为非法输入，返回0。
 * 3.第一段数字一旦遇到数字以外的字符，视为第一段数字终止，以第一段数字为结果返回。
 */
public class Code008 {

    public int myAtoi(String str) {
        int sign = 1;
        long result = 0;
        str = str.trim();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if ('-'==c||'+'==c){
                sign = '-'==c?-1:1;
                i++;
                c = i<str.length()?str.charAt(i):'F';
            }
            if ((int)c<48||(int)c>58){
                break;
            }
            if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE %10 < c-'0') {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (c - '0');
        }
        return sign * (int)result;
    }
}
