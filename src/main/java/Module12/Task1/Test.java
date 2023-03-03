package Module12.Task1;

public class Test {
    public static void main(String[] args) {
        Task1 counterTime = new Task1();
        Thread performanceProgram = new Thread(counterTime::performed);
        Thread message = new Thread(counterTime::theAmountOfTimeThatHasPassed);
        performanceProgram.start();
        message.start();

        try {
            performanceProgram.join();
            message.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
    }
}
