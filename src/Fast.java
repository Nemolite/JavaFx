class Test75{
    int factR(int n){
        int rez;
        if(n==1) return 1;
        System.out.println(n);
        rez = factR(n-1)*n;
        return rez;
    }
}
public class Fast {
    public static void main(String[] args){
         Test75 nt = new Test75();
         System.out.println(nt.factR(4));
    }
}
