
public class Exam7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] rezarr = new int[arr.length];

        for(int i=0,j=0;i<arr.length;i++){
            if(2!=i)
            {
                rezarr[j] = arr[i];
                j++;
            }
        }


        for(int i=0;i<rezarr.length;i++){
            if (0!=rezarr[i])
            System.out.println(rezarr[i]);
        }




    }
}
