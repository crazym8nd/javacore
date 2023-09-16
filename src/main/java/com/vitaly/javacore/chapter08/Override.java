package main.java.com.vitaly.javacore.chapter08;

class AA{
    int i,j;
    AA(int a, int b){
        i =a;
        j = b;
    }
    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}
class BB extends AA{
    int k;
    BB(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(String msg){
        System.out.println(msg+ k);
    }
}
class Override {
    public static void main(String[] args) {
        BB subOb = new BB(1,2,3);
        subOb.show("Это k: ");
        subOb.show();
    }
}
