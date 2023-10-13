import javax.swing.*;

class Test{
    void show(){
        System.out.println("Я анонимный объект");
    }
}





public class Inter {
    public static void main(String[] args){
         new Test().show();
         String str = "Hello,World";
         String name = JOptionPane.showInputDialog("Как тебя зовут?");
         System.out.println(name);
        JOptionPane.showMessageDialog(null,str);

        System.out.println(args[0]);

    }
}
