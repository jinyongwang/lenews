package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapTest extends Thread {

    static Map map = new HashMap<>();
    @Override
    public void run() {
        map.put("1",Thread.currentThread().getName());
        System.out.println(map.get("1"));
    }

    public static void main(String[] args) {
        MapTest t1 = new MapTest();
        MapTest t2 = new MapTest();
        t1.start();
        t2.start();
    }
}
