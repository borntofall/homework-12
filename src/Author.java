public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author (String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String getFullName() {
        return nameAuthor + " " + surnameAuthor;
    }
}
