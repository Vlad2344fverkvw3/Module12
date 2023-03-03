package Module12.Task2;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main_Test_FizzBuzz {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        ExecutorService servicre = Executors.newFixedThreadPool(4);
        servicre.submit(task2::number);
        servicre.submit(task2::fizz);
        servicre.submit(task2::buzz);
        servicre.submit(task2::fizzbuzz);
        servicre.shutdown();
        System.out.println(new FizzBuzzTest().print(task2));

    }
     }

