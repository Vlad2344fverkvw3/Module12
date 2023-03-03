package Module12.Task2;


import java.util.LinkedList;
import java.util.Queue;




public class Task2 {
    private volatile int number = 1;

    public final Queue<String> queue = new LinkedList<>();


    public synchronized void number() {

        while (number <= 15) {
            if (number % 3 != 0 && number % 5 != 0) {
                queue.add(String.valueOf(number));
                number++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error number method");
                }
            }
        }
    }

    public synchronized void fizz() {
        while (number <= 15) {
            if (number % 3 == 0 && number%5 !=0) {
                queue.add("fizz");
                number++;
                notifyAll();
            } else {
                try {

                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error fizz method");
                }
            }

        }

    }

    public synchronized void buzz() {

        while (number < 15) {
            if (number % 5 == 0 ) {
                queue.add("buzz");
                number++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error buzz method");
                }
            }
        }

    }

    public synchronized void fizzbuzz() {

        while (number <= 15) {
            if (number % 5 == 0) {
                queue.add("fizzbuzz");
                number++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error fizzbuss method");
                }
            }
        }

    }



    }



