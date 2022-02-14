package Z3;

import java.io.File;

public class Funkcja {
    public static File[] wszystkiePodkatalogi(File katalog){
        return katalog.listFiles(File::isDirectory);
    }
}
