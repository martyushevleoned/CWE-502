package injection;

import java.io.*;

public class Injection implements Serializable {

    private final RunnableSerializable runnable;

    public Injection(RunnableSerializable runnable) {
        this.runnable = runnable;
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runnable.run();
    }
}