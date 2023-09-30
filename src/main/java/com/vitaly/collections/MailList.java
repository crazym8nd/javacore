package main.java.com.vitaly.collections;

import java.util.LinkedList;

class Address {

        private final String name;
        private final String city;
        private final String street;
        private final String state;
        private final String code;
        Address(String n, String s, String c, String st, String cd) {
            name = n;
            street = s;
            city = c;
            state = st;
            code = cd;
        }
        public String toString () {
            return name + "\n" + street + "\n" + city + " " + state + " " + code;
        }
    }

    class MailList{
        public static void main(String[] args) {
            LinkedList<Address> m1 = new LinkedList<Address>();
            m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
            m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
            m1.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));
for(Address element : m1){
    System.out.println(element + "\n");
    System.out.println();
}

        }

    }




