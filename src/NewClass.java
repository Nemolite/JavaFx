interface MyInfCalss{
    public int a = 34;
    void MyInClass();

    static void myfanc(){
        System.out.println("???");
    }

}

class MySubClass implements MyInfCalss{
    public void MyInClass(){
        System.out.println("???");
    }

//    static void myfanc(){
//        System.out.println("-???-");
//    }

}
public class NewClass {
    public static void main(String[] args){
        MySubClass obj = new MySubClass();
        System.out.println(MySubClass.a);
        System.out.println(obj.a);
//        System.out.println(obj.myfanc());

    }
}
