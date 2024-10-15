import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Название: " + this.name + ". Автор: " + this.author.toString() + ". Год: " + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book otherAuthor = (Book) obj;

        return Objects.equals(name, otherAuthor.name) &&
                Objects.equals(year, otherAuthor.year) &&
                Objects.equals(author, otherAuthor.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}