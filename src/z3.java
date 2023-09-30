
public class z3 {
    public static void main(String[] args){

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String password = new String();

        password = "Hello,String";
        char ch = password.charAt(6);
        System.out.println(ch);

        String n1,n2,c1 = new String();
        n1 = "Hello";
        n2 = "World";
        c1 = n1.concat(n2);
        System.out.println(c1);




//        for(int i=0;i<=password.length();i++){
//            System.out.println(password.charAt(i));
//        }
    }
}
