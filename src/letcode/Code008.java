package letcode;

/**
 * Created by ZK on 2017/7/24.
 * Implement atoi to convert a string to an integer.
 * ��ĿҪ�������⣬���վ���������飬�ó����¼��㣺
 * 1.��һ���ǿյ��ַ������ǡ�+����-����ֱ�Ӵ����ֿ�ʼ������һ����Ϊ�Ƿ����룬����0��
 * 2.��+���͡�-��֮�����������֣�������Ϊ�Ƿ����룬����0��
 * 3.��һ������һ����������������ַ�����Ϊ��һ��������ֹ���Ե�һ������Ϊ������ء�
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
