abstract class Exam1{

   abstract double display(int x,int y);

   double display2(int x, int y){
       double res = x + y;
       return res;
   }
}

interface Exam27{

    void print();
}

abstract class Exam5 implements Exam27 {
    abstract double display2(int x,int y);
}

class Exam2 extends Exam1 {
    Exam2(){

    }
    int a;
    int b;
    double result;
    double display(int a,int b){
        this.a = a;
        this.b = b;

        this.result = this.a + this.b;
        return this.result;
    }


}



public class Answer {
    public static void main(String[] args){
        Exam2 obj2 = new Exam2();
        double res = obj2.display(4,5);
        System.out.println(res);

        double h =  obj2.display2(2, 3);

    }
}