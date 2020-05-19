package CWW519;

public class ThreadSate {
    public static void main(String[] args) {
        for(Thread.State state : Thread.State.values()){
            System.out.println(state);
        }
    }
}
