package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/* Một người sẽ có 1 acc. Ng chơi có thể đặt số tiền ít hơn hoặc bằng tiền họ đang có
    Luật chơi:
        - Có sẵn 5000 đ
        - Có 3 viên xx, lấy tổng số chấm
        - Tổng = 3 || 18, cái ăn hết
        - Tổng 4 -> 10, xỉu ăn
        - Tổng 11 -> 17, tài ăn
 */
public class TaiXiu {
    public static void main(String[] args) {

        double account = 5000;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
        NumberFormat num = NumberFormat.getCurrencyInstance(lc);


        int luaChon = 1;
        do {
            System.out.println("TRÒ CHƠI TÀI XỈU HAY NHẤT NĂM 2024");
            System.out.println("-------MỜI BẠN LỰA CHỌN---------");
            System.out.println("1.Tiếp tục");
            System.out.println("0.Thoát");
            luaChon  = sc.nextInt();
            if(luaChon == 1) {
                System.out.println("-------LET GOOOOOO---------");
                System.out.println("Tài khoản của bạn : " + num.format(account));
                double datCuoc = 0;
                do {
                    System.out.print("Nhập số tiền muốn cược: ");
                    datCuoc = sc.nextDouble();
                } while ( datCuoc > account || datCuoc <= 0) ;

                int choice = 0;
                do {
                    System.out.println("1.Tài ");
                    System.out.println("2.Xỉu ");
                    System.out.print("Tài hay Xỉu : ");
                    choice = sc.nextInt();
                } while ( choice != 1 && choice != 2) ;

                Random xx1 = new Random();
                Random xx2 = new Random();
                Random xx3 = new Random();

                int n1 = xx1.nextInt(6)+1;
                int n2 = xx2.nextInt(6)+1;
                int n3 = xx3.nextInt(6)+1;

                int res = n1+n2+n3;

                System.out.println("Kết quả : "+n1+" "+n2+" "+n3);
                System.out.println("--> "+res+" <--");
                if(res == 3 || res == 18) {
                    System.out.println("Nhà cái xin hết nhé <3");
                    account-=datCuoc;
                    System.out.println("Tài khoản của bạn : " + num.format(account));

                } else if(res >= 4 && res<=10) {
                    if(choice == 1) {
                        System.out.println("Thua mất rùi :( ");
                        account-=datCuoc;
                        System.out.println("Tài khoản của bạn : " + num.format(account));


                    } else {
                        System.out.println("Thắng lớn, thắng lớn !");
                        account+=datCuoc;
                        System.out.println("Tài khoản của bạn : " + num.format(account));


                    }
                } else {
                    if(choice == 2) {
                        System.out.println("Thua mất rùi :( ");
                        account-=datCuoc;
                        System.out.println("Tài khoản của bạn : " + num.format(account));


                    } else {
                        System.out.println("Thắng lớn, thắng lớn !");
                        account+=datCuoc;
                        System.out.println("Tài khoản của bạn : " + num.format(account));

                    }
                }
            } else if(luaChon == 0){
                return ;
            }
        } while (luaChon == 1) ;
    }
}
