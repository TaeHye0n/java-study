package chap12_thread.exam05;

public class StatePrintThread extends Thread{
    private Thread targetThread;

    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    @Override
    public void run(){
        while(true){
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드 상태: " + state);

            if(state == Thread.State.NEW){
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED) {
                break;
            }
            try{
                Thread.sleep(100);
            } catch (Exception e){}
        }
    }
}
