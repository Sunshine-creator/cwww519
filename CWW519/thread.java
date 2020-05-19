package CWW519;

public class thread {
    public static  synchronized  void test1(){

    }
    public synchronized  void test2(){

    }

    public static void main(String[] args) {
         Object o = new Object();
         synchronized (o){    //对象头：每个对象有对象头

         }
    }
}
