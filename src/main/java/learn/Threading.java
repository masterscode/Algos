package learn;

import java.util.Optional;

public class Threading {
    public static void main(String[] args) {
        Thread threader = new Thread(
                new Runnable() {
                    @Override // convert to a lambda later
                    public void run() {
                        System.out.printf("we are currently runnin the - %s - thread", Thread.currentThread().getName());
                    }
                }
        );

        System.out.printf("we are now running the thread %s", Thread.currentThread().getName());
        threader.start();
        System.out.printf("we are now running the thread %s", Thread.currentThread().getName());
        try {Thread.sleep(1000);}catch (Exception e){};

        Runnable runner = ()-> System.out.println("say hello");

    }
}
