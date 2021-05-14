package Section2;

public class Account {
    private int numberAccount = 0;

    public synchronized void add(int num){
        numberAccount += num;
        System.out.println("Đã nộp vào " + num);
        notify();
    }

    public synchronized void sub(int num){
        if (numberAccount < 50000){
            System.out.println("Số dư phải lớn hơn 50000!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberAccount -= num;
        System.out.println("Đã rút " + num);
    }
}
//t1 và t2 cùng chờ sẽ xảy ra deadlock
//thread pool
// hạn chế sl Thread chạy đồng thời trong chương trình
// Có bao nhiêu Thread cũng được nhưng chỉ "giới hạn" 1 lúc chạy bao nhiêu
//thread cố định
//Công việc của thread pool là start các thread theo kịch bản