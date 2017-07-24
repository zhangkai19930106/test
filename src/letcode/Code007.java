package letcode;

import java.util.Stack;

/**
 * Created by ZK on 2017/7/24.
 * Reverse digits of an integer.
 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class Code007 {

    public int reverse(int x) {
        double result = doReverse(Math.abs(x));
        if (x>0){
            return result>2147483647?0:(int)result;
        }else {
            return result>2147483648.0?0:(int)(0-result);
        }
    }

    private double doReverse(int x){
        Stack stack = new Stack();
        int digit = 0;
        double result = 0;
        while (x>0){
            int y = x%10;
            stack.push(y);
            x = x/10;
            digit++;
        }
        for (int i=0;i<digit;i++){
            double coefficients = Double.valueOf(stack.pop().toString());
            double index = i;
            result = result + coefficients * Math.pow(10,index);
            System.out.println(result);
        }
        return result;
    }

}
