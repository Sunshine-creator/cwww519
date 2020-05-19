package CWW519;

import cww516.cww0516.MyThread;

public class main {
    public static void main(String[] args) {
        MyThread mt = new MyThread() ;
        Thread t1 = new Thread(mt,"黄牛A");
        Thread t2 = new Thread(mt,"黄牛B");
        Thread t3 = new Thread(mt,"黄牛C");
        t1.start();
        t2.start();
        t3.start();
    }
}
