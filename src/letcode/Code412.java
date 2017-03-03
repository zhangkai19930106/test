package letcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZK on 2017/3/3.
 */
public class Code412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i=1;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            if (i%3==0){
                sb.append("Fizz");
            }
            if (i%5==0){
                sb.append("Buzz");
            }
            if (sb.length()<1){
                sb.append(i);
            }
            result.add(sb.toString());
        }
        return result;
    }
}
