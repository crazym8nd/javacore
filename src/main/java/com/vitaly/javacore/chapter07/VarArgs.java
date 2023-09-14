package main.java.com.vitaly.javacore.chapter07;

class VarArgs {
    static void vaTest(int ... v){
        System.out.print(" Количества аргументов: " + v.length + " Содержимое: ");

        for(int x:v)
            System.out.print(x + " ");

        System.out.println();
        }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
    }

