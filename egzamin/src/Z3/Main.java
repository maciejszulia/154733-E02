package Z3;

import Z1.ArrayUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        File katalog_1 = new File("C:/Program Files");
        File[] listaKatalogow = Funkcja.wszystkiePodkatalogi(katalog_1);
        ArrayList<File>listaKatalogow_1 = new ArrayList<>(List.of(listaKatalogow));

        System.out.println(listaKatalogow);
        System.out.println(listaKatalogow_1);
    }
}
