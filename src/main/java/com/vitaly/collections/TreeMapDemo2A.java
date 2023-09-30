package main.java.com.vitaly.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareTo(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());


        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        tm.put("Джoн Доу", new Double(3434.34));
        tm.put("Toм Смит", new Double(123.22));
        tm.put ( "Джейн Бейкер", new Double (1378.00));
        tm.put("Toд Холл", new Double(99.22));
        tm.put("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance =tm.get ( "Джoн Доу" ) ;
        tm.put("Джoн Доу", balance + 1000); System.out.println("Hoвый остаток на счете Джона Доу: " + tm.get("Джoн Доу"));

    }
}
