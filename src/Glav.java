abstract class MaserA{
    MaserA(){
        System.out.println("PotMasterA");
    }
    abstract void methoda();
    abstract void methoda2();
}

class PotMasterA extends MaserA{
    void methoda(){
        System.out.println("PotMasterA");
    }

    void methoda2(){
        System.out.println("PotMasterA2");
    }
}

abstract class SubMasterA extends MaserA{
    abstract void methoda3();
    abstract void methoda2();

    void myfanc(){
        System.out.println("SubMasterA extends MaserA");
    }
}
 class Pot2SubMasterA extends SubMasterA{
     void methoda(){
         System.out.println("Pot2SubMasterA");
     }

     void methoda2(){
         System.out.println("Pot2SubMasterA");
     }
     void methoda3(){
         System.out.println("Pot2SubMasterA");
     }
 }

 class Basa2 {
    int a;
    void mmm(){
        System.out.println("Pot2SubMasterA");
    }
 }

 abstract class NasBasa extends Basa2{
     void mmm(){
         System.out.println("Pot2SubMasterA111");
     }
 }



public class Glav {
    public static void main(String[] args){
        PotMasterA obj = new PotMasterA();
        Pot2SubMasterA obj2 = new Pot2SubMasterA();
    }
}
