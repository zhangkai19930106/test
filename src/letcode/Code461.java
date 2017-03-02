package letcode;

/**
 * Created by ZK on 2017/3/2.
 */
public class Code461 {

    public int hammingDistance(int x, int y) {
        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);
        char[] charsX = strX.toCharArray();
        char[] charsY = strY.toCharArray();
        int max = Math.max(charsX.length, charsY.length);
        int min = Math.min(charsX.length, charsY.length);
        int result = 0;
        if (max == min){
            for (int i=0;i<max;i++){
                if (charsX[i] != charsY[i]){
                    result++;
                }
            }
        }else {
            for (int i = max - 1; i >= max - min; i--) {
                for (int j = min - 1; j >= 0; j--) {
                    if (charsX.length > charsY.length) {
                        if (charsX[i] != charsY[j]) {
                            result++;
                        }
                    } else {
                        if (charsX[j] != charsY[i]) {
                            result++;
                        }
                    }
                }
            }
            for (int i = max - min - 1; i >= 0; i--) {
                if (charsX.length > charsY.length) {
                    if (charsX[i] == '1') {
                        result++;
                    }
                } else {
                    if (charsY[i] == '1') {
                        result++;
                    }
                }
            }
        }
        return result;
    }

}
