class Famaly{
    int a;

     Famaly(){
        System.out.println("Hello");
     }
    Famaly(int d){
       this.a = d;
    }
}

class Child extends Famaly{

    Child(){
        super();
        this.a = super.a;
    }
    Child(int f){
        super(f);
        this.a = super.a;
    }

    Child(int a, int b){
        System.out.println(a + b);
        this.a = super.a;
    }

}

public class Father {
    public static void main(String[] args){
        Child obj = new Child();
        Child obj1 = new Child(3);
        System.out.println(obj1.a);
        Child obj3 = new Child(3,5);
    }
}
