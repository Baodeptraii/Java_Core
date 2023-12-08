import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCoffee cf1 = new MyCoffee("Trung Nguyên",25000,5.2);
        MyCoffee cf2 = new MyCoffee("G7",20000,3.6);
        MyCoffee cf3 = new MyCoffee("Capuchino",55000,1.2);
        double a = cf1.MyBill();
        System.out.println(a);

        double b = cf2.MyBill();
        System.out.println(b);

        double c = cf3.MyBill();
        System.out.println(c);
//        double n;
//        System.out.print("Nhập khối lượng cần kiểm tra : ");
//        n = sc.nextDouble();
//
//        if(cf1.Checking(n)) {
//            System.out.println("Khối lượng caffee bạn mua lớn hơn "+n+" kg");
//        } else {
//            System.out.println("Khối lượng caffee bạn mua bé hơn "+n+" kg");
//        }
        double x;
        System.out.print("Khuyến mãi hôm nay giảm cho hóa đơn trên 100000 : ");
        x = sc.nextDouble();
        System.out.println(cf1.Discount(x));
        System.out.println(cf1.LastBill(x));

        System.out.println(cf2.Discount(x));
        System.out.println(cf2.LastBill(x));

        System.out.println(cf3.Discount(x));
        System.out.println(cf3.LastBill(x));

    }
}
