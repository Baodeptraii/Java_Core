public class Author {
    private String Author_name;
    private Dob Author_dob;

    public Author(String author_name, Dob author_dob) {
        Author_name = author_name;
        Author_dob = author_dob;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public Dob getAuthor_dob() {
        return Author_dob;
    }

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    public void setAuthor_dob(Dob author_dob) {
        Author_dob = author_dob;
    }

    @Override
    public String toString() {
        return  this.Author_name + " (" + this.Author_dob +") ";
    }
}
