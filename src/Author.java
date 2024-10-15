import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Имя - " + this.firstName + ", Фамилия - " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Author otherAuthor = (Author) obj;

        return Objects.equals(firstName, otherAuthor.firstName) &&
                Objects.equals(lastName, otherAuthor.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getLastName() {
        return this.lastName;
    }
}
