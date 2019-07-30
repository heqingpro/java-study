package study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author heqingqing
 * @Description: 十人分工$
 * @date 2019/7/24 23:08
 */
public class Word10 {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            executorService.execute(()->{
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                System.out.println("word");
            });
        }
        executorService.shutdown();
        if(executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)){
            System.out.println("nextWord");
        }
    }
}
