package homework10.task2;

import java.io.*;
import java.util.Queue;

public class testTask2 {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("src/main/java/homework10/task2/file.txt");

        Queue resultList =MyFileReader.readFromFile(is);

        FileWriter fr = new FileWriter("src/main/java/homework10/task2/user.json");
        fr.write(JsonTransformator.transform(resultList));
        fr.flush();
        fr.close();


        System.out.println(JsonTransformator.transform(resultList));

    }
}
