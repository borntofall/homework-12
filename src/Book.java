public class Book {
    private Author author;
    private String name;
    private int year;

    public Book(Author author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
