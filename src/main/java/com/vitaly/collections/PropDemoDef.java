package main.java.com.vitaly.collections;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "теллеси");
        defList.put("висконсин", "Мэдисон");

        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("вашингтон","Олимпия");
        capitals.put("Калифорния","Сакраменто");
        capitals.put("индиана", "индианаполис");
        Set<?> states = capitals.keySet();
        for(Object name : states) System.out.println("столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        System.out.println();

        String str = capitals.getProperty("Флорида");
        System.out.println("столица штата флорида " + str + ".");
    }
}
