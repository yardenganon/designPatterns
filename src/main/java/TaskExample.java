import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class TaskExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder(URI.create("https://catfact.ninja/fact")).header("accept", "application/json").build();
            System.out.println("Haha, i'm running on another thread");
        };
        Thread thread = new Thread(task);
        thread.start();

        thread.join();
    }
}
