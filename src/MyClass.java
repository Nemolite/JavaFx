interface MyInter{
    void fanc();
     default void fanc2(){
        System.out.println("fanc2");
    }

    static void fanc3(){
        System.out.println("fanc3");
    }


}

interface SuvMyInter extends MyInter{
    void fanc();
}

class MyInterClass implements MyInter{
    public void fanc(){
        System.out.println("MyInterClass<-MyInter");
    }

    public void fanc2(){
        System.out.println("MyInterClass->fanc2");
    }

}

class MyInterClass2 implements MyInter{
    public void fanc(){
        System.out.println("MyInterClass2<-MyInter");
    }
}


public class MyClass {
    public static void main(String[] args){
        MyInterClass mic = new MyInterClass();
        mic.fanc();

        MyInterClass2 mic2 = new MyInterClass2();
        mic2.fanc();

        MyInter mi = new MyInterClass();
        mi.fanc();
        mi  = new MyInterClass2();
        mi.fanc();

      mi.fanc2();

      mi = new MyInterClass();
      mi.fanc2();

        MyInter.fanc3();


    }
}
