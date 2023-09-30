// Домашее задание 3.Шифровка пароля
import java.util.Arrays;
import java.util.Scanner;
public class exam3 {
    public static void main(String[] args) {
        System.out.print("Введите строку для шифрования = ");
        Scanner sc = new Scanner(System.in);
        String userset = sc.nextLine();
        int len = userset.length();
        int d;
        System.out.print("Зашифрованная строка = ");
        for (int i = 0;i<len;i++){
            d = userset.charAt(i);
            if ((48<=d)&(57>=d)){
                System.out.print(Character.toChars(d+1));
            } else if ((97<=d)&(122>=d)){
                System.out.print(d);
            }
        }
        sc.close();

        int[] arr = new int[]{1,2,3,4};
        for(int e:arr){
            System.out.println(e);
        }

        int[] arr1 = new int[]{-234, -2, 16, 26, 35, 43, 80, 92, 99, 167};

        String str1;
        str1 = Arrays.toString(arr1);
        System.out.println(str1);

    }
}
