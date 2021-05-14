package Section3_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnable {
    public static void main(String[] args) {
        // Khai báo một Thread Pool thông qua newSingleThreadExecutor() của Executors
        ExecutorService executorService = Executors.newSingleThreadExecutor();
///newSingleThreadExecutor() Chỉ cho chạy 1 thread trong CT
        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable " + i);
            executorService.execute(myRunnable);
        }

        // Phương thức này sẽ được nói sau ở ExecutorService
        executorService.shutdown();
    }
}
