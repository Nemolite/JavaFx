class GrossFahter{
    int a;
}
class Fahter extends GrossFahter{
        int b;
        int s;
        void selfSet(){
            this.s = this.a + b;
        }
}

public class MyTiClass {
    public static void main(String[] args){
        Fahter obj = new Fahter();
        obj.a = 12;
        obj.b = 11;
        obj.selfSet();
        System.out.println(obj.s);
        System.out.println(obj.a);
    }
}
