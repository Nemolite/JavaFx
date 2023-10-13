import lake.Ocean;
import street.City;

interface SunOcean extends Ocean{
    void fanc45();
//    this.fanc2();
}

abstract class SunCity extends City{
    public abstract void display2();
    public void fanc21(){
        System.out.println("fanc2");
    }
//    this.fanc2();
}

interface SunOcaen extends Ocean{
    void fanc34();
}

class MyInfClass implements Ocean{
    public void fanc() {
        System.out.println("Ocean");
    }
}

class MyAbClass extends City {

    public void display(){
        System.out.println("fanc");
    }
}

class MyFreshAbINtfClass extends City implements Ocean{
    public void display(){
        System.out.println("fanc");
    }
    public void fanc() {
        System.out.println("Ocean");
    }
}


public class Super {
    public static void main(String[] args){
        MyInfClass in = new MyInfClass();
        in.fanc();

        MyFreshAbINtfClass obj3 = new MyFreshAbINtfClass();
        obj3.fanc2();
        MyAbClass obj4 = new MyAbClass();
        obj4.fanc2();

        MyAbClass obj21 = new MyAbClass();
//        obj21.fanc21();


    }
}
