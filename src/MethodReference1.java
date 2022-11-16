
public class MethodReference1 {
    public static void m1()
    {
        for (int i = 0; i <10; i++) {
            System.out.println("child-thread");
        }
    }
    public static void main(String[] args) {
        /*Runnable r = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }
        };*/
        Runnable r = MethodReference1::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main method");
        }
    }
}