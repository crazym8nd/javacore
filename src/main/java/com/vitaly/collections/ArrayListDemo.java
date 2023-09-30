package main.java.com.vitaly.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("начальный размер списочного массива al: " + al.size());

    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1, "A2");
    System.out.println("конечный размер списочного массива al: " + al.size());
        System.out.println("содержимое списочного массива al: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("размер списочного массива al порсле удаления элементов: " + al.size());
        System.out.println("содержимое списочного массива al: " + al);


    }
}
