package chap12_thread.exam06.sub02_yield;

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run(){
        while(!stop){
            if(work){
                System.out.println("ThreadA 작업 내용");
            }else{
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
