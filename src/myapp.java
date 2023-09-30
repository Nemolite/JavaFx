import java.util.Scanner;

public class myapp {
    public static void main(String[] args) {

       int examplearr[];
       examplearr = new int[4];
        examplearr[0] = 23;
        examplearr[1] = 3;
        examplearr[2] = 11;
        examplearr[3] = 78;

        for(int k=0;k<examplearr.length;k++){
            System.out.println(examplearr[k]);
        }
        System.out.println(examplearr[0]);
        System.out.println(examplearr[1]);
        System.out.println(examplearr[2]);
        System.out.println(examplearr[3]);

        int[] nums = new int[] { 1, 2, 3, 5 };

        int[] nums2 = { 1, 2, 3, 5 };

        for(int k=0;k<nums2.length;k++){
            System.out.println(nums2[k]);
        }

    }
}
