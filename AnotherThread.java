package language;
import static language.Threads.ThreadColor.ANSI_BLUE;
import static language.Threads.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
       System.out.println(ANSI_PURPLE + "Hello from another thread."+ currentThread().getName());
       try {
              Thread.sleep(5000);
       }catch(InterruptedException e){
                System.out.println("Another thread woke me up");
                return;


       }
        System.out.println(ANSI_BLUE + "Five seconds have passed and I am awake.");
    }
}
