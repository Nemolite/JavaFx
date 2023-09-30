class Arif {
    int oper(int a, int b){
        return a + b;
    }

    double oper(double a, int b){
        return (a / b)*2;
    }

    String oper(double a, double b){
        return String.valueOf(a + b);

    }
}

public class Exam11 {
    public static void main(String[] args){
       Arif ar = new Arif();
       System.out.println(ar.oper(2,2));
        System.out.println(ar.oper(2.0,2));
        System.out.println(ar.oper(2.0,2.0));
        String tmp = ar.oper(2.0,3.0);
        System.out.println(tmp.getClass().getName());
        System.out.println(ar.oper(2.0,7.0).getClass().getName());

    }
}
