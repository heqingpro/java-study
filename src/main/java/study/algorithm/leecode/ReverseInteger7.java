package study.algorithm.leecode;

/**
 * @author heqingqing
 * @Description: 整数反转$
 * @date 2019/6/29 3:32
 */
public class ReverseInteger7 {

    public int reverse(int x) {

        int result = 0;
        while(x != 0){
            int num = x%10;
            x = x/10;
            if(result>Integer.MAX_VALUE/10 || (result ==Integer.MIN_VALUE && num>7)){
                return  0;
            }
            if(result<Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE && num<8)){
                return 0;
            }
            result = result*10 + num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/10);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE+Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+Integer.MAX_VALUE+1);
        System.out.println(Integer.MAX_VALUE/10+7);
        System.out.println(Integer.MAX_VALUE/10+8);
        long sum = ((long) Integer.MAX_VALUE+1)*2;
        System.out.println(sum);
    }
}
