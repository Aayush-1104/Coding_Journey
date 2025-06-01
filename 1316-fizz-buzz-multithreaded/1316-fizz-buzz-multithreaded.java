import java.util.concurrent.locks.*;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int i=1;
    private final Lock lock=new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(i<=n && (i%3!=0 || i%5 ==0)){
                    condition.await();
                }
                if(i>n) break;
                printFizz.run();
                i++;
                condition.signalAll();
            }
            finally{
                lock.unlock();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(i<=n && (i%5 !=0 || i%3==0)){
                    condition.await();
                }
                if(i>n) break;
                printBuzz.run();
                i++;
                condition.signalAll();
            }finally{
                lock.unlock();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(i<=n && (i%15!=0)){
                    condition.await();
                }
                if(i>n)break;
                printFizzBuzz.run();
                i++;
                condition.signalAll();
            }
            finally{
                lock.unlock();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(true){
            lock.lock();
            try{
                while(i<=n && (i%3==0 || i%5 ==0)){
                    condition.await();
                }
                if(i>n) break;
                printNumber.accept(i);
                i++;
                condition.signalAll();
            }finally{
                lock.unlock();
            }
        }
    }
}