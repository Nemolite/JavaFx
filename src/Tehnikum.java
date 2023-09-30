import java.util.Date;

class Students{
    private int a;
    private int b;
    private String fam;
    protected String name;
    public String datar;
    int numstudtikeck;
    public boolean male;

    public int showticket(){
        return numstudtikeck;
    }
    /* true - m,false - ж */
    public boolean setmale(boolean check){
        male =check;
        return male;
    }

    public void setfam(String fammily){
        this.fam = fammily;

    }
    public String getfam(){
        return this.fam;

    }

    public void seta(int innera){
        this.a = innera;
    }

    public void setb(int innerb){
        this.b = innerb;
    }

    public void sumer(){
        System.out.println(this.a + this.b);
    }
}
public class Tehnikum {
    public static void main(String[] args) {

        Students first = new Students();
        first.setmale(true);
        System.out.println(first.male);
        //System.out.println(first.fam);
        first.setfam("Vushnyakov");

        String tmp = first.getfam();
        System.out.println(tmp);
        first.name = "Sergey";
        Students last = new Students();
        System.out.println(last);

        last.seta(2);
        last.setb(2);
        last.sumer();
        last.numstudtikeck = 123456;
        System.out.println(last);

    }
}
