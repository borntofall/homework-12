
import java.util.Objects;

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
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Author temp = (Author) object;
        return temp.nameAuthor.equals(this.nameAuthor) && temp.surnameAuthor.equals(this.surnameAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
    @Override
    public String toString () {
        return "Автор книги: " + this.nameAuthor + " " + this.surnameAuthor;
    }
}
