package homework10.task3;

import java.io.File;
import java.io.IOException;

public class testTask3 {

    public static void main(String[] args) {
        File file = new File("src/main/java/homework10/task3/file.txt");
        try {
            System.out.println(WordsCounter.getStatistic(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
