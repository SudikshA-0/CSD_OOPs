package multi_threading;
/* there are two ways to create threads
1. Thread class
2. Runnable interface

Life Cycle Of Thread

New --- (start()) ---> Runnable ----------> Running----------> Terminate
                                              |
                                              |
                                              |
                                              v
                         (waiting, suspend , sleep , interpret ) non - runnable

RUNNABLE INTERFACE

 */

class csd extends Thread{
    public void run(){
        System.out.println("task");
    }
}

class csd1 implements Runnable{
    public void run(){

        System.out.println("task1");

    }
}


public class thread {
    public static void main(String[] args) {
        csd cs = new csd();
        cs.run();

        csd csd1 = new csd();
        Thread t1 = new Thread(csd1);
    }
}