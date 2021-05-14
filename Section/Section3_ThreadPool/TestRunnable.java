package Section3_ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestRunnable {
    //https://yellowcodebooks.com/2019/09/16/java-bai-49-thread-pool-tap-2-executors-executor-va-executorservice/
//thread pool
// hạn chế sl Thread chạy đồng thời trong chương trình
// Có bao nhiêu Thread cũng được nhưng chỉ "giới hạn" 1 lúc chạy bao nhiêu
//thread cố định
//Công việc của thread pool là start các thread theo kịch bản
    public static void main(String[] args) {
        // Khai báo một Thread Pool thông qua newSingleThreadExecutor() của Executors
        /*======================================================================*/
        //ExecutorService executorService = Executors.newSingleThreadExecutor(); // 1 thread chạy duy nhất
        ExecutorService executorService = Executors.newFixedThreadPool(5); //5 thread chạy đồng thời
        //ExecutorService executorService = Executors.newCachedThreadPool(); //
        /*======================================================================*/
        List<Future> listFuture = new ArrayList<Future>();
///newSingleThreadExecutor() Chỉ cho chạy 1 thread trong CT
        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable " + i);
            //executorService.execute(myRunnable);//submit(myRunnable)
            Future future = executorService.submit(myRunnable);
            listFuture.add(future);
        }
        /*================================================*/
        for (Future future : listFuture) {
            try {
                // Khi Thread nào kết thúc, get() của Future tương ứng sẽ trả về null
                System.out.println(future.get());
            } catch (ExecutionException | InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
// thread chạy được quản lý bởi future
        //t1 chạy nếu f1.get = null thì t1 chạy xong rồi
        // Phương thức này sẽ được nói sau ở ExecutorService
        executorService.shutdown();//Giải phóng ThreadPool
    }
}
