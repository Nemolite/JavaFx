class Mirror{
    int myfanc(int n,int m){
        if((n==0)||(m==0)) return 0;
        int sum = n + m;
        n--;
        m--;
        sum= sum + this.myfanc(n,m);
        return sum;
    }
}


public class Tema {
    public static void main(String[] args) {
        Mirror t = new Mirror();
            int result = t.myfanc(4,4);
            System.out.println(result);
    }
}
