import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4, true);
        new Car ("Auto1", semaphore);
        new Car ("Auto2", semaphore);
        new Car ("Auto3", semaphore);
        new Car ("Auto4", semaphore);
        new Car ("Auto5", semaphore);
        new Car ("Auto6", semaphore);
        new Car ("Auto7", semaphore);
        new Car ("Auto8", semaphore);
        new Car ("Auto9", semaphore);
        new Car ("Auto10", semaphore);
        new Car ("Auto11", semaphore);
        new Car ("Auto12", semaphore);
        new Car ("Auto13", semaphore);
        new Car ("Auto14", semaphore);

    }
}
