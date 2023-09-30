class ExamStatic{
    static int a = 4;
    static void myfanc(){
        System.out.println("static");
    }
    void myfanc2(){
        this.myfanc();
    }

    void myfanc4(){
        System.out.println("no static");
    }

    static void myfanc3(){

    }
        }
public class MyStatic {
    public static void main(String[] args) {
        ExamStatic ty1 = new ExamStatic();
        ty1.a = 5;
        System.out.println(ty1.a);
        ExamStatic ty2 = new ExamStatic();
        System.out.println(ty2.a);
        System.out.println(ExamStatic.a);
        ExamStatic.myfanc();

        ty1.myfanc();
        ty1.myfanc2();
    }
}
