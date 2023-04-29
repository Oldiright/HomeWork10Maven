package homework10.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TelFileSearcher {

    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File("src/main/java/homework10/task1/file.txt");
        System.out.println(textFile.exists());
        System.out.println(textFile.getPath());

        Scanner scanner = new Scanner(textFile);

        while (scanner.hasNext()) {
            String currentPhoneNum = scanner.nextLine();
            if (currentPhoneNum.length() == 14) {
                if(currentPhoneNum.charAt(0) == '('
                        & currentPhoneNum.charAt(4) == ')'
                        & currentPhoneNum.charAt(5) == ' '
                        & currentPhoneNum.charAt(9) == '-') {
                    String clearNum = currentPhoneNum.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "").replaceAll(" ", "");
                    if (clearNum.length() != 10) {
                        continue;
                    }

                    boolean result = true;
                    for(int i = 0; i < clearNum.length(); i++) {
                        result = Character.isDigit(clearNum.charAt(i));
                        if (!result) {
                            break;
                        }
                    }
                    if (result) {
                        System.out.println(currentPhoneNum);
                    }

                }
            } else if(currentPhoneNum.length() == 12) {
                if (currentPhoneNum.charAt(3) == '-' & currentPhoneNum.charAt(7) == '-') {
                    String clearNum = currentPhoneNum.replaceAll("-", "");
                    if(clearNum.length() != 10) {
                        continue;
                    }
                    boolean result = true;
                    for(int i = 0; i < clearNum.length(); i++) {
                        result = Character.isDigit(clearNum.charAt(i));
                        if (!result) {
                            break;
                        }
                    }
                    if (result) {
                        System.out.println(currentPhoneNum);
                    }

                }

            }
        }
        scanner.close();
    }
}
