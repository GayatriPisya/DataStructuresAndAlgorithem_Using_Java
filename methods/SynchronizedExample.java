package methods;
//Used in multithreading to ensure only one thread accesses the method at a time.
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println("Count: " + counter.getCount());
    }
}
