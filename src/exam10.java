class Books{
    void bookshow(){
        System.out.println("Показ книг");
    }

    void bookshow(String tx){
        System.out.println("Показ книг");
        System.out.println(tx);
    }

    String bookshow(String tx, String tx2){
        System.out.println("Показ книг");
        System.out.println(tx);
        System.out.println(tx2);
        return tx + tx2;
    }
}
public class exam10 {
    public static void main(String[] args){
        Books bk = new Books();
        bk.bookshow();
        bk.bookshow("По ком звонит колокол");
        String bkshow = bk.bookshow("Hello","OOP");
        System.out.println(bkshow);
    }
}
