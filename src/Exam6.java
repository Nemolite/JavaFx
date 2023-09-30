import java.util.Scanner;
class MyArr{
    public int[][] inner(int usern){
        int[] arr = new int[usern];
        int[] arr2 = new int[usern];
        for (int i=0,a=0;i<usern;i++,a++){
            arr[i] = i+1;
            arr2[a] = i+1;
        }
        int [][] twoDimArray = {arr,arr2};
        return twoDimArray;
    }

    public void show(int arr[]){
       int i=0;
        System.out.print("[");
       while (arr.length>i){
           System.out.print(arr[i]);
           if(arr.length-1!=i){
               System.out.print(",");
           }
           i++;
       }
        System.out.print("]");
    }
}
public class Exam6 {
    public static void main(String[] args) {
        System.out.print("Введите число = ");
        Scanner sc = new Scanner(System.in);
        int userset = sc.nextInt();

        MyArr ext = new MyArr();
        int myarr[][] = ext.inner(userset);
        ext.show(myarr[0]);
        System.out.println();
        ext.show(myarr[1]);
        sc.close();


    }
}
