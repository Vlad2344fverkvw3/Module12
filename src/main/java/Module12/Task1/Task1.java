package Module12.Task1;

public class Task1 {

        private  int second = 0;
        public void performed() {
            while (second < 20) {
                for (int i = 0; i < 5; i++) {

                    second++;
                    System.out.printf("Time : %d seconds\n", second);
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Error!");
                }
                theAmountOfTimeThatHasPassed();
            }
        }

        public void theAmountOfTimeThatHasPassed() {
            if (second != 1)
                System.out.printf("%d seconds have passed!\n", second);
        }
}
