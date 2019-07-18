package study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/10 19:36
 */
public class Test2 {
    public static void main(String[] args) {

        LockExemple example = new LockExemple();
        LockExemple example1 = new LockExemple();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->example.test());
        executorService.execute(()->example1.test());
    }
}
class SynchronizedExample {

    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
class LockExemple{
    private Lock lock = new ReentrantLock();
    public void test(){
        lock.lock();
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }catch (Exception e){

        }
        finally {
            lock.unlock();
        }

    }
}
