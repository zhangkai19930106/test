/**
 * Created by ZK on 2017/3/2.
 */
public class Test {

    public static void main(String[] ars){
        System.out.println(hammingDistance(4,14));
    }

    public static int hammingDistance(int x, int y) {

        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);
        char[] charsX = strX.toCharArray();
        char[] charsY = strY.toCharArray();
        System.out.println(charsX);
        System.out.println(charsY);
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
            int i,j;
            for (i = max - 1,j = min - 1; i >= max - min; i--,j--) {
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
            for (int k = max - min - 1; k >= 0; k--) {
                if (charsX.length > charsY.length) {
                    if (charsX[k] == '1') {
                        result++;
                    }
                } else {
                    if (charsY[k] == '1') {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
