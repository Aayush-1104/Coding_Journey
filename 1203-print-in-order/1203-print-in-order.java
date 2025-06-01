import java.util.concurrent.locks.*;
class Foo {
    private final Lock lock =new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int turn = 0;

    public Foo() {
        // turn=0 (initial state)
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try{
            printFirst.run(); //prints "First"
            turn = 1;
            condition.signalAll(); 
        }
        finally{
            lock.unlock();
        }
        // // printFirst.run() outputs "first". Do not change or remove this line.
        // printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try{
            while(turn != 1){
                condition.await();
            }
            printSecond.run();
            turn =2;
            condition.signalAll();
        }
        finally{
            lock.unlock();
        }
        // // printSecond.run() outputs "second". Do not change or remove this line.
        // printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try{
            while(turn!=2){
                condition.await();
            }
            printThird.run();
        }
        finally{
            lock.unlock();
        }
        // // printThird.run() outputs "third". Do not change or remove this line.
        // printThird.run();
    }
}