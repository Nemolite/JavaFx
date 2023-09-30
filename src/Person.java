class Auto{
    String model;
    double speed;
    int power;

    double obr(){
        double sum = speed + power;
        return sum;
    }
}

public class Person {
    public static void main(String[] args) {
        Auto machin = new Auto();
        machin.model = "KIA seed";
        machin.speed=90.00;
        machin.power = 105;

//        double tmp = machin.obr();
        System.out.println(machin.obr());

        System.out.println(machin.model);
        System.out.println(machin.speed);
        System.out.println(machin.power);

        Auto machin2 = new Auto();
        machin2.model = "KIA rio";
        machin2.speed=120.00;
        machin2.power = 110;

//        double tmp2 = machin2.obr();
        System.out.println(machin2.obr());

        System.out.println(machin2.model);
        System.out.println(machin2.speed);
        System.out.println(machin2.power);

        System.out.println(machin.power + machin2.power);
    }
}
