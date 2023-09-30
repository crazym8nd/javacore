package main.java.com.vitaly.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("E");
        ts.add("B");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

    }
}
