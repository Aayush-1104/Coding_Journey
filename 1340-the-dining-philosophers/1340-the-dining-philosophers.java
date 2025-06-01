import java.util.concurrent.Semaphore;

class DiningPhilosophers {

    private final Semaphore[] forks = new Semaphore[5];
    private final Semaphore waiter = new Semaphore(1); // allows one philosopher to pick both forks safely

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1); // initialize forks
        }
    }

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        int left = philosopher;
        int right = (philosopher + 1) % 5;

        waiter.acquire(); // ensure only one philosopher tries to pick forks at a time

        forks[left].acquire();     // pick left fork first
        forks[right].acquire();    // then right

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();

        forks[left].release();     // release left
        forks[right].release();    // then right

        waiter.release();          // let next philosopher try
    }
}

