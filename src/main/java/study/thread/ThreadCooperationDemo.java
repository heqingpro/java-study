package study.thread;

/**
 * @author heqingqing
 * @Description: 三个线程循环依次打印$
 * @date 2019/7/29 20:39
 */
public class ThreadCooperationDemo {

    public int count = 0;
    public synchronized void addCount(){
        this.count++;
        if(count == 3){
            count = 0;
        }
    }
    public synchronized int getCount(){
        return this.count;
    }
    class A implements Runnable{
        private ThreadCooperationDemo cooperationDemo;
        public A(ThreadCooperationDemo cooperationDemo){
            this.cooperationDemo = cooperationDemo;
        }
        @Override
        public void run(){
            while (true) {
                if (cooperationDemo.getCount() == 0){
                    System.out.println("A");
                    cooperationDemo.addCount();
                }
            }
        }
    }

    class B implements Runnable{
        private ThreadCooperationDemo threadCooperationDemo;
        public B(ThreadCooperationDemo threadCooperationDemo){
            this.threadCooperationDemo = threadCooperationDemo;
        }
        @Override
        public void run(){
            while (true){
                if(threadCooperationDemo.getCount() == 1){
                    System.out.println("B");
                    threadCooperationDemo.addCount();
                }
            }
        }
    }
    class C implements Runnable{
        private ThreadCooperationDemo threadCooperationDemo;
        public C(ThreadCooperationDemo threadCooperationDemo){
            this.threadCooperationDemo = threadCooperationDemo;
        }
        @Override
        public void run(){
            while (true){
                if(threadCooperationDemo.getCount() == 2){
                    System.out.println("C");
                    threadCooperationDemo.addCount();
                }
            }
        }
    }

    public void test(){
        ThreadCooperationDemo threadCooperationDemo = new ThreadCooperationDemo();
        Thread threadA = new Thread(new A(threadCooperationDemo));
        Thread threadB = new Thread(new B(threadCooperationDemo));
        Thread threadC = new Thread(new C(threadCooperationDemo));
        threadA.start();
        threadB.start();
        threadC.start();
    }

    public static void main(String[] args) {
        ThreadCooperationDemo demo = new ThreadCooperationDemo();
        demo.test();
    }
}
