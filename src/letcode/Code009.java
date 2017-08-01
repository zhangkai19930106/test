package letcode;

/**
 * Created by ZK on 2017/7/25.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Code009 {

    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
