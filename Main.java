package language.Threads;

import language.AnotherThread;

import language.AnotherThread;

import java.sql.SQLOutput;

import static language.Threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
	System.out.println(ANSI_RED+ " Hello from the main thread.");

        Thread anotherThread=new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_BLUE + "Hello  again from the anonymous thread.");
            }

        }.start();

        Thread ourRunnableThread =new Thread(new OurRunnable()
        {
            @Override
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class's implementation of run().");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_GREEN + "Another thread was: " + "was terminated and I am running again.");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I couldn't wait after all.I was interrupted");
                }
            }
        });
        ourRunnableThread.start();
//        anotherThread.interrupt();
        System.out.println(ANSI_RED +" Hello  again from the main thread.");
    }
}
