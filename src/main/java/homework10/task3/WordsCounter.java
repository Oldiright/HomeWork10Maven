package homework10.task3;

import java.io.*;
import java.util.*;


public class WordsCounter {

    public static String getStatistic(File file) throws IOException {
        String rawText = getTextFromFile(file).strip();
        String[] rawWordsArray = rawText.split("\\s+");
        Map<String, Integer> resultMap = new HashMap<>();

        for(String word: rawWordsArray) {
            boolean hasWord = resultMap.containsKey(word);
            if(!hasWord){
                resultMap.put(word, 1);
            } else {
                resultMap.replace(word, resultMap.get(word) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = resultMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);


        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                result.append(list.get(i).getKey()  + " " + list.get(i).getValue());
            } else {
                result.append(list.get(i).getKey()  + " " + list.get(i).getValue() + "\n");

            }
        }
        return result.toString();
    }

    private static String getTextFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        Scanner scanner = new Scanner(is);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine() + " ");
        }
        is.close();
        return result.toString();
    }
}
