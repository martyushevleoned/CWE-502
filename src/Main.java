import utils.Deserializer;
import injection.Injection;
import utils.Serializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Injection injection = new Injection(() -> {
            System.out.println("any code can be executed here");
        });

        String serializedInjection = Serializer.serializeBase64(injection);
        Object object = Deserializer.deserializeBase64(serializedInjection);
    }
}