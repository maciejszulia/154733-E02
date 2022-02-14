package Z1;

import java.lang.Integer;
import java.lang.String;
import java.time.LocalTime;

public class Main {


    public static void main(String[] args){
        Integer[] integers_sorted = {0,1,1,2,3,4,5};
        Integer[] integers_unsorted = {0,1,2,1,3,4,5};

        LocalTime[] localTime_sorted= {
                LocalTime.of(11,30),
                LocalTime.of(12,30),
                LocalTime.of(13,30),
                LocalTime.of(14,30)
        };

        LocalTime[] localTime_unsorted= {
                LocalTime.of(11,30),
                LocalTime.of(10,30),
                LocalTime.of(13,30),
                LocalTime.of(14,30)
        };

        String[] string_sorted = {"ania","barbara"};
        String[] string_unsorted = {"wiktor","ania","barbara"};

        System.out.println(ArrayUtil.isSorted(integers_sorted));
        System.out.println(ArrayUtil.isSorted(integers_unsorted));
        System.out.println(ArrayUtil.isSorted(localTime_sorted));
        System.out.println(ArrayUtil.isSorted(localTime_unsorted));
        System.out.println(ArrayUtil.isSorted(string_sorted));
        System.out.println(ArrayUtil.isSorted(string_unsorted));
    }

}
