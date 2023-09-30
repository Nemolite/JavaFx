
import static java.lang.System.out;

class Example{
    int a;
    int b;
    Example(int innerA){
        this.a = innerA;
    }

    Example(int innerA,int innerB){
        this.a = innerA;
        this.b = innerB;
    }
}
public class Exam8 {
    void show(int a, String b){
        out.println();
    }
    public static void main(String[] args) {

        Example objA = new Example(11);

        int sum = 2 + objA.a;
        out.println(sum);

        Example objB = new Example(11,23);
        int sum2 = objB.a + objB.b;
        out.println(sum2);

    }
}
