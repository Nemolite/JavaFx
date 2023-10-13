class MyInClass{
    private int a;
    private int b;

    public int a1;
    public int b1;

    void setA(int x){
        this.a = x;
    }

    int getA(){
        return this.a;
    }

    void setB(int x){
        this.b = x;
    }

    int getB(){
        return this.b;
    }
}

class Nasled extends MyInClass{
     public int NasMyFanc(){
         int sum1 = this.getA() + this.a1;
         return sum1;

     }

    public int NasMyFanc2(){
        int sum1 = this.getB() - this.b1;
        return sum1;

    }

    public int NasMyFanc3(){
        int sum1 = this.getB() * this.getA();
        return sum1;

    }

    public double NasMyFanc4(){
        double div1 = this.a1/this.b1;
        return div1;

    }
}

public class MyCalss {
    public static void main(String[] args){
        Nasled obj = new Nasled();
        obj.setA(12);
        obj.setB(4);
        obj.a1 = 12;
        obj.b1 = 4;

        System.out.println(obj.NasMyFanc4());


    }
}
