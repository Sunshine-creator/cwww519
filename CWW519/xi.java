package CWW519;

public class xi {
    private  Object o =new Object();
    private static Object calss;
    private  static Object T = xi.calss;
    public static synchronized void t1() throws InterruptedException {
        Thread.sleep(1000);
    }
    public synchronized void t2() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void t3() throws InterruptedException {
        synchronized (o){
            Thread.sleep(10000);
        }
    }
    public void t4() throws InterruptedException {
        synchronized (T){
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        new Thread(()->{
            try {
                new xi().t2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                new xi().t2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    xi t = new xi();
//    new Thread(()->{
//
//    }).s
}
