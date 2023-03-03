package Module12.Task2;



import java.util.StringJoiner;

public class FizzBuzzTest {
       public String print(Task2 value){
            StringJoiner joiner = new StringJoiner(",");
            while (!value.queue.isEmpty())
                joiner.add(value.queue.poll());

          return joiner.toString();

    }
}
