package lec1;

public class Cpoly {

    Cpoly(){

    }
    Cpoly(int a){

    }

    public static void main(String[] args) {
        System.out.println("S");
        Cpoly cc = new Cpoly();
        cc.m1();
    }

    public static void main() {
        System.out.println("U");
    }


    void m1(int a){
        System.out.println("U");
    }

    void m1(){                     // we can have same name method in one class but with different parameters.
        System.out.println("D");
    }

    void m1(int a, String b){
        System.out.println("I");
    }


}
