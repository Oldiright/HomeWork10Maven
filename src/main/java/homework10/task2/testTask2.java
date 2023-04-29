package homework10.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class testTask2 {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("src/main/java/homework10/task2/file.txt");

        Queue resultList = MyFileReader.readFromFile(is);
        System.out.println(JsonTransformator.transform(resultList));

    }
}
