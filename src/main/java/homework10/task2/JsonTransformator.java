package homework10.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Queue;

public class JsonTransformator {

    public static String transform(Queue list) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(list);

        return  result;
    }



}
