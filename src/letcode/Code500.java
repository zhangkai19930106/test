package letcode;

import java.util.*;

/**
 * Created by ZK on 2017/3/3.
 */
public class Code500 {

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        Set set1 = new HashSet<>(Arrays.asList(new String[]{"Q","W","E","R","T","Y","U","I","O","P","q","w","e","r","t","y","u","i","o","p"}));
        Set set2 = new HashSet<>(Arrays.asList(new String[]{"A","S","D","F","G","H","J","K","L","a","s","d","f","g","h","j","k","l"}));
        Set set3 = new HashSet<>(Arrays.asList(new String[]{"Z","X","C","V","B","N","M","z","x","c","v","b","n","m"}));
        for (String str : words){
            String[] strs = str.split("");
            Set set = new HashSet<>(Arrays.asList(strs));
            if (set1.containsAll(set)||set2.containsAll(set)||set3.containsAll(set)){
                list.add(str);
            }
        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }


}
