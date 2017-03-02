package letcode;

/**
 * Created by ZK on 2017/3/2.
 */
public class Code476 {

    public int findComplement(int num) {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i=0;i<chars.length;i++){
            if ('1' == chars[i]){
                chars[i] = '0';
            }else {
                chars[i] = '1';
            }
        }
        int result = Integer.parseInt(String.valueOf(chars),2);
        return result;
    }
}
