import java.util.Arrays;

public class exam4 {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//        for (int k=arr.length-1;k>=0;k--){
//            System.out.println(arr[k]);
//        }

//        String str1 = "Hello, World";
//        for (int i=0;i<str1.length();i++){
//            System.out.println(str1.charAt(i));
//        }
//
//        for (int k=str1.length()-1;k>=0;k--){
//            System.out.println(str1.charAt(k));
//        }

//        char[] charr = new char[]{'a','s','f'};

//        System.out.println(charr[0]);

//        String[] intro = new String[] { "once", "upon", "a", "time" };
//        String[] abridgement = Arrays.copyOfRange(intro, 0, 3);
//        System.out.println(abridgement[0].charAt(0));

        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(arr[0][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][2]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
        int sum =0;
        int sum1 =0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                    sum= sum + arr[i][j];
                } else {
                    sum1= sum1 + arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
