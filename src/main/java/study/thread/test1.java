package study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/10 11:08
 */
public class test1 {

    public static void main(String[] args) throws Exception{
        //Runnable
        Thread thread1 = new Thread(new MyRunnable("MyRunnable1"));
        Thread thread2 = new Thread(new MyRunnable("MyRunnable2"));
        thread1.start();
        thread2.start();

        //Callable
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread3 = new Thread(futureTask);
        thread3.start();
        System.out.println(futureTask.get());

        //MyThread
        Thread thread = new MyThread();
        thread.start();

        //Executors
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executorService.execute(new MyRunnable("thread"+i));
        }
        executorService.shutdown();
    }
}
class MyRunnable implements Runnable{

    public String name;

    public MyRunnable(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name);
    }

}

class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() {
        return 123;
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread");
    }
}