package main.java.com.vitaly.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("список отсортирован в обратном порядке: ");
        for(int i : ll) System.out.print(i+ " ");

        System.out.println();

        Collections.shuffle(ll);
        System.out.print("Список перетасован: ");
        for(int i : ll) System.out.print(i + " ");
        System.out.println();
        System.out.println("минимум: " + Collections.min(ll));
        System.out.println("максимум: " + Collections.max(ll));
    }
}
