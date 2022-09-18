import java.sql.SQLOutput;

class NewThread extends Thread {
    boolean superflag;

    NewThread(String name, ThreadGroup gr1) {
        super(gr1, name);
        superflag = false;
        start();
    }

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (superflag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Mistake in " + getName());
        }
        System.out.println("Ending "+ getName());
    }
    synchronized void mysus(){
        superflag=true;
    }
    synchronized void myres(){
        superflag=false;
        notify();
    }
}

public class Threadsss {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("First");
        ThreadGroup tg2=new ThreadGroup("Second");
        NewThread nt1=new NewThread("Process1",tg1);
        NewThread nt2=new NewThread("Process2",tg1);
        NewThread nt3=new NewThread("Process3",tg2);
        NewThread nt4=new NewThread("Process4",tg2);
        System.out.println("List!");
        tg1.list();
        tg2.list();
        System.out.println("Pausing First Group");
        Thread mass[]=new Thread[tg1.activeCount()];
        tg1.enumerate(mass);
        for(int i=0;i< mass.length;i++){
            ((NewThread)mass[i]).mysus();
        }
        System.out.println("Pausing main thread in progress...");
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println("Cant stop main thread");
        }
        System.out.println("Resuming First!");
        for(int i=0;i< mass.length;i++){
            ((NewThread)mass[i]).myres();
        }
        try{
            nt1.join();
            nt2.join();
            nt3.join();
            nt4.join();
        }catch (Exception e){
            System.out.println("Exception in main!");
        }
        System.out.println("Main thread end!");
    }
}
