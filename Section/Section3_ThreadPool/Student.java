package Section3_ThreadPool;

import java.util.concurrent.Callable;

public class Student implements Callable<String> {
    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception{
        System.out.println(name + " đang thực thi...");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return name;
    }
}
