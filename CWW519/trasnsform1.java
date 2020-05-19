package CWW519;

public class trasnsform1 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t = new Thread(() -> {
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000_0000; i++) {}
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t.getState());;
        t.start();
        System.out.println(t.getState());
        Thread.sleep(10);
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println(t.getState());
            }
            object.notify();
        }
        while (t.isAlive()) {
            System.out.println(t.getState());
        }
    }
}
//观察-3: yield() 大公无私，让出 CPU
//public class ThreadDemo {
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(() -> {
//            while (true) {
//                System.out.println(Thread.currentThread().getName()
//                        + ": 我跑着呢");
//// Thread.yield();
//            }
//        }, "李四");
//        比特


