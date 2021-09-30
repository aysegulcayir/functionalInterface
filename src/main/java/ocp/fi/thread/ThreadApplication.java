package ocp.fi.thread;

public class ThreadApplication {

    public static void main(String[] args) {

        ThreadApplication threadApplication = new ThreadApplication();

        long start = System.currentTimeMillis();

        System.out.println(Thread.currentThread());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println( "Execution Time: "+(System.currentTimeMillis() - start));

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Inside run...");
                System.out.println(Thread.currentThread());


            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Runnable runnable2 = ()-> System.out.println("Hello...");
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        MyRunnable myRunnable = new MyRunnable("Kevin", threadApplication);
        Thread thread3 = new Thread(myRunnable);
        thread3.start();
        }

        public   void callBack(String message){
            System.out.println(message);
        }

    }

