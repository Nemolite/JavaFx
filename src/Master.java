class Basa {
    protected int a;
    void mthed(Basa obj){
        System.out.println(obj.a);
    }
}

class Nasle1 extends Basa{
       Nasle1(int x){
           this.a = x;
       }
}

class Nasle2 extends Basa{
    Nasle2(int x){
        this.a = x;
    }
}

public class Master {
    public static void main(String[] args){
        Nasle1 obj1 = new Nasle1(11);
        Nasle2 obj2 = new Nasle2(12);
         obj1.mthed(obj2);
         obj2.mthed(obj1);
         obj2.a = 23;
    }
}
