public class proc {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 5 };
        int sum = 0;
        for(int k=0;k<nums.length;sum += k++);

        System.out.println(sum);
        int d = 2,f = 2;

        float res  = sumer(d,f,'+');
        System.out.println(res);
        float res1  = sumer(27,21,'-');
        if (0==res1){
            System.out.println("Вы неправильно ввели операцию");
        }

        /////////////////////////////////////

        float rez = calcer(d,f,'/');
        System.out.println(rez);

    }

    public static float sumer(int a,int b,char opr){
        float result;
        if ('+'==opr) {
            result = a + b;
        } else if ('-'==opr){
            result = a - b;
        } else if ('*'==opr){
            result = a * b;
        } else if ('/'==opr){
            result = a / b;
        }else{
            result = 0;
        }
        return result;
    }

    public static float calcer(int a,int b,char opr){
        int result;
        switch(opr){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
