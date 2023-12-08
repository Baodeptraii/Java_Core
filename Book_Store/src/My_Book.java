public class My_Book {
    private String Book_name;
    private double price;
    private Dob Release_Year;
    private Author My_Author;

    public My_Book(String book_name, double price, Dob release_Year, Author my_Author) {
        Book_name = book_name;
        this.price = price;
        Release_Year = release_Year;
        My_Author = my_Author;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Dob getRelease_Year() {
        return Release_Year;
    }

    public void setRelease_Year(Dob release_Year) {
        Release_Year = release_Year;
    }

    public Author getMy_Author() {
        return My_Author;
    }

    public void setMy_Author(Author my_Author) {
        My_Author = my_Author;
    }

    void print_main_in4() {
        System.out.printf(Book_name+ "- ");
        System.out.println(My_Author.getAuthor_name());

    }
    //boolean checkYear



    @Override
    public String toString() {
        return  "Tên sách : " + "'"+ Book_name + "'"+ "" +
                "\nGiá : " + price + " đô "+  "\nPhát hành vào : " + Release_Year +
                " của tác giả " +My_Author ;

    }


}
