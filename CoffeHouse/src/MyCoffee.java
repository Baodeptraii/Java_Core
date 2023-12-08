public class MyCoffee {
    private String ten;
    private double gia, khoiluong;

    public MyCoffee(String t, double g, double k) {
        this.gia = g;
        this.ten = t;
        this.khoiluong = k;
    }

    public double MyBill () {
        System.out.print("Cà phê bạn mua là "+this.ten+" có giá : ");
        return (this.gia * this.khoiluong );
    }

    public  boolean Checking(double kl) {
        return this.khoiluong > kl;
    }

    public double Discount(double x) {
        System.out.print("Hóa đơn được giảm: ");

        if(this.gia * this.khoiluong >100000) {
            return (x/100)*(this.gia * this.khoiluong );
        } else {
            return 0;
        }

    }

    public double LastBill (double x) {
        System.out.print("Hóa đơn còn : ");
        if (this.gia * this.khoiluong > 100000) {
            return ((this.gia * this.khoiluong) - (x / 100) * (this.gia * this.khoiluong));

        } else {

            return (this.gia * this.khoiluong);
        }

    }
}
