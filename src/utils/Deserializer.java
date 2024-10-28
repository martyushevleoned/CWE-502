package utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Deserializer {

    public static Object deserializeBase64(String source) throws IOException, ClassNotFoundException {
        byte[] decoded = Base64.getDecoder().decode(source.getBytes(StandardCharsets.UTF_8));
        ByteArrayInputStream bis = new ByteArrayInputStream(decoded);
        ObjectInput in = new ObjectInputStream(bis);
        return in.readObject();
    }
}
