package thread_pool_demo;

/**
 * @author linqi
 * @version 1.0.0
 * @description
 */

public class Main {
    public static void main(String[] args) {
        // 创建一个自定义线程池
        MyThreadPool myThreadPool = new MyThreadPool();
        // 将任务提交给线程池
        myThreadPool.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " is running,任务异步线程执行.");
        });

        // 表示主线程没有阻塞
        System.out.println(Thread.currentThread().getName() + " is running,主线程没有阻塞.");
    }
}
