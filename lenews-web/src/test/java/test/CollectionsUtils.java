package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtils {
    public static void main(String[] args) {
        List l = new ArrayList<Integer>();
        l.add(10);
        l.add(8);
        l.add(9);
        Collections.sort(l, new Comparator(t) {

        });
        System.out.println(l);
    }
}
