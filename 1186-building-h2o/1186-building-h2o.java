import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class H2O {
    private final Lock lock=new ReentrantLock();
    private final Condition cv=lock.newCondition();
    private int turn=0; //
    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		lock.lock();
        try{
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            while(turn==2){
                cv.await();
            }
            releaseHydrogen.run();
            turn++;
            cv.signalAll();
        }finally{
            lock.unlock();
        }
        
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        lock.lock();
        try{
            while(turn<2){
                cv.await();
            }
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
		    releaseOxygen.run();
            turn =0;
            cv.signalAll();
        }finally{
            lock.unlock();
        }
        
    }
}