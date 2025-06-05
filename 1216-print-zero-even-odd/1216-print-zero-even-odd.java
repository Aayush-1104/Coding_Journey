import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class ZeroEvenOdd {
    private int n;
    private int i=1;
    private int turn=0; // 0=zero, 1=odd, 2=even
    private final Lock lock =new ReentrantLock();
    private final Condition cv=lock.newCondition();
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(turn!=0 && i<=n){
                cv.await();
            } 
            if(i>n) break;
            printNumber.accept(0);
            turn=(i%2==0)? 2:1;
            cv.signalAll();
            }
            finally{
                lock.unlock();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(turn!=2 && i<=n){
                    cv.await();
                }
                if(i>n) break;
                printNumber.accept(i++);
                turn=0;
                cv.signalAll();
            }
            finally{
                lock.unlock();
            }
        }    
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(turn!=1 && i<=n){
                    cv.await();
                }
                if(i>n) break;
                printNumber.accept(i++);
                turn=0;
                cv.signalAll();
            }finally{
                lock.unlock();
            }
        }
    }
}