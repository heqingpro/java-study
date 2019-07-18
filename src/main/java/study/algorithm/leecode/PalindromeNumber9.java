package study.algorithm.leecode;

/**
 * @author heqingqing
 * @Description: 判断一个整数是否是回文数$
 * @date 2019/6/29 21:44
 */
public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
        String s= x+"";
        int i = 0,j=s.length()-1;
        while(i<j){
            if(!(s.charAt(i)==s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        int result = 0,param = x;
        while (x != 0){
            int num = x%10;
            x = x/10;
            if (result > Integer.MAX_VALUE || (result == Integer.MIN_VALUE && num>7)) {
                result = 0;
                break;
            }
            if(result<Integer.MIN_VALUE ||(result == Integer.MIN_VALUE && num<8)){
                result =0;
                break;
            }
            result = result*10+num;
        }
        if (result != param){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(s.charAt(0)==s.charAt(2));
    }

}
