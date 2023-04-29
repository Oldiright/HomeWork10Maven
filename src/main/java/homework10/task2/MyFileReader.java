package homework10.task2;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class MyFileReader {


    public static Queue readFromFile(InputStream is) throws FileNotFoundException {
        Scanner scanner = new Scanner(is);

        scanner.nextLine();
        Queue list = new ArrayDeque();
        while(scanner.hasNextLine()) {
            String[] currentString = scanner.nextLine().split(" ");
            list.add(new User(currentString[0], Integer.parseInt(currentString[1])));
        }
        scanner.close();
        return list;

    }
}
