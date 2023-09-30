import static java.lang.System.out;

class Inner{
    int a;
    int b;
}

class  Outer {
    Inner exp(Inner inner,int c,int d){
        inner.a = c;
        inner.b = d;
        out.println(inner);
        return inner;

    }
}


public class Exam9 {
    public static void main(String[] args){
         Inner objInner  = new Inner();
         out.println(objInner);
         Outer objOuter = new Outer();
         out.println(objOuter);
         Inner res = objOuter.exp(objInner,2,3);
         out.println(res.a);
        out.println(res.b);
    }
}
