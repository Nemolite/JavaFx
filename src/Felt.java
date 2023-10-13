class A {
    int a;
    void myA(){
        System.out.println("A");
    }

    void myA1(){
        System.out.println("A");
    }

    void inv(A a){
        System.out.println(a.a);
    }
}

class B extends A {
    int a;
    void myA(){
        System.out.println("B");
    }

    void inmyA(){
        super.myA();
    }
}

public class Felt {
    public static void main(String[] args){
        A a = new A();
        A test1;
        B b = new B();
        test1 = b;

    }
}
