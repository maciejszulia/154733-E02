package Z2;

import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.lang.Character;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList1 = new LinkedList<>(List.of(1,3,5,7,9));
        System.out.println(linkedList1);
        Funkcja.print(linkedList1);

        TreeSet<Character>treeMap = new TreeSet<>(List.of('A','B'));
        System.out.println(treeMap);
        Funkcja.print(treeMap);

        ArrayList<String>arrayList = new ArrayList<>(List.of("aaa","bbb"));
        System.out.println(arrayList);
        Funkcja.print(arrayList);
    }
}
