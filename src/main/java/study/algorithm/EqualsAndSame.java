package study.algorithm;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/6/30 17:03
 */
public class EqualsAndSame {
    public void test1(){
        String aa = "abc";
        String bb = "abc";
        System.out.println("aa==bb:"+aa==bb);
        System.out.println("aa.equals(bb):"+aa.equals(bb));
    }

    public static void main(String[] args) {
        EqualsAndSame equalsAndSame = new EqualsAndSame();
        equalsAndSame.test1();
        String aa = "hello";
        String bb = new String("hello");
        System.out.println(aa==bb);
        aa.intern();
    }
}
