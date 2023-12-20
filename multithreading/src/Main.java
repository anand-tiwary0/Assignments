
class MyThread extends Thread{
    public void run(){
        //this is the job of this thread
        for(int i = 0; i<10; i++){
            System.out.println("this is thread ");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        t.setPriority(10);
        t.start();
        System.out.println(t.getName());
        t.setName("random");
        for (int i =0; i<10; i++){
            System.out.println("this is main thread");
        }
    }
}