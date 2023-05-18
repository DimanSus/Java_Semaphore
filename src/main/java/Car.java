import java.util.concurrent.Semaphore;

public class Car extends Thread{
    String name;
    Semaphore sem;

    public Car(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока с именем " + name);
        try{
            System.out.println( name+ " ожидает разрешения");
            sem.acquire();
            System.out.println( name + " получил разрешение");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        if ((int) (Math.random() * 10 + 2) % 2 == 1) {
            System.out.println(name + " освобождает разрешение");
            sem.release(1);
        }
    }
}
