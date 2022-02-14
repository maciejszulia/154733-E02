package Z2;

import java.util.Iterator;
import java.util.*;

public class Funkcja {
    public static <E extends Iterable<?>> void print(E obiekt) {
        Iterator<?> iter1 = obiekt.iterator();
        if (iter1.hasNext())
            System.out.print("[" + iter1.next() + "], ");
        while (iter1.hasNext())
            System.out.print("[" + iter1.next() + "], ");

    }
}
