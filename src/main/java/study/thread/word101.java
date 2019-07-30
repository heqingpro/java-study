package study.thread;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/24 23:46
 */
public class word101 {

    class testA implements Runnable{
        public int msg;
        public testA(int msg){
            this.msg=msg;
        }
        @Override
        public void run(){
            try {
                Thread.sleep(10000);
            }catch (Exception e){

            }
            System.out.println("wordA"+"***"+msg);
        }
    }
    public Thread test(int i) throws Exception{
        Thread a = new Thread(new testA(i));
        a.start();
        return a;
    }

    public static void main(String[] args) throws Exception{
        word101 word = new word101();
        Thread a1 = word.test(1);
        Thread a2 = word.test(2);
        Thread a3 = word.test(3);
        Thread a4 = word.test(4);
        Thread a5 = word.test(5);
        Thread a6 = word.test(6);
        Thread a7 = word.test(7);
        Thread a8 = word.test(8);
        Thread a9 = word.test(9);
        Thread a10 = word.test(10);
        a1.join();
        a2.join();
        a3.join();
        a4.join();
        a5.join();
        a6.join();
        a7.join();
        a8.join();
        a9.join();
        a10.join();
        System.out.println("over");
    }
}
