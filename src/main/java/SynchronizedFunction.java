import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedFunction {

    private int count = 0;
    synchronized public void incrementSync() {
        this.count++;
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {
        SynchronizedFunction synchronizedFunction = new SynchronizedFunction();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.range(0, 10000).forEach(i-> executorService.submit(() -> synchronizedFunction.incrementSync()));
        try {
            executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println(synchronizedFunction.getCount());


    }
}
