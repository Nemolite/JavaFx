class Ancestors{
     void myfanc(){
         System.out.println("Ancestors");
     }

}

class Heirs extends Ancestors {
    void myfanc(){
        System.out.println("Heirs");
    }
}

public class Work {
    public static void main(String[] args){
        Ancestors obj1 = new Ancestors();
        Ancestors obj3;
        obj3 = obj1;
        Heirs obj2 = new Heirs();
        obj1.myfanc();
        obj2.myfanc();
        obj3.myfanc();


    }
}
