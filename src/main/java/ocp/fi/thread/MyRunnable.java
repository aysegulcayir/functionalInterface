package ocp.fi.thread;

public class MyRunnable implements Runnable{
    String name ;
    ThreadApplication threadApplication;


    public MyRunnable(String name,ThreadApplication threadApplication) {
        this.name = name;
        this.threadApplication = threadApplication;
    }

    @Override
    public void run() {
        System.out.println("Inside MyRunnable..."+name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadApplication.callBack("Hello callBack...");
    }

}
