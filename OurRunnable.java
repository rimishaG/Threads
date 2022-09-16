package language.Threads;

import static language.Threads.ThreadColor.*;

public class OurRunnable implements Runnable{
     @Override
      public void run(){
        System.out.println(ANSI_GREEN +"Hello from our runnable's" +
                "implementation of run().");
    }
}
