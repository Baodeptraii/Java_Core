import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // My_Book Book1 = new My_Book();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        My_Book[] book = new My_Book[n];
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String title = sc.nextLine();

            double price = sc.nextDouble();

            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            Dob releaseDate = new Dob(day, month, year);

            sc.nextLine();
            String authorName = sc.nextLine();

            int authorDay = sc.nextInt();
            int authorMonth = sc.nextInt();
            int authorYear = sc.nextInt();
            Dob authorDob = new Dob(authorDay, authorMonth, authorYear);

            Author author = new Author(authorName, authorDob);
            book[i] = new My_Book(title, price, releaseDate, author);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(book[i]);

        }

//        Dob dob1 = new Dob(10,12,2004);
//        Dob dob2 = new Dob(20,9,2014);
//        Dob dob3 = new Dob(22,11,1980);
//
//        Dob rls1 = new Dob(1,1,2024);
//        Dob rls3 = new Dob(6,10,2000);
//        Dob rls2 = new Dob(18,5,2042);
//
//        Author au1 = new Author("Bảo ngu", dob1);
//        Author au2 = new Author("Dũng béo", dob2);
//        Author au3 = new Author("Mẹ mai", dob3);
//
//        My_Book book1 = new My_Book("Tôi bị ngu ntn ? ", 5.654,rls1,au1);
//        My_Book book2 = new My_Book("Berserk ", 1.5506,rls2,au2);
//        My_Book book3 = new My_Book("JJs ", 6.84,rls3,au3);

//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);

//        book1.print_main_in4();
//        book2.print_main_in4();
//        book3.print_main_in4();

    }
}
