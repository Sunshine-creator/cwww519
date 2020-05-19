package CWW519;
public class Test implements Runnable {
    private int ticket = 1000 ; // 一共十张票
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
             synchronized (this){
                 if(this.ticket>0){
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
//                         e.printStackTrace();
                     }
                     System.out.println(Thread.currentThread().getName() +",还有" +this.ticket-- +" 张票");
                 }
             }

        }
    }

//    public static void main(String[] args) {
//
//    }
}
