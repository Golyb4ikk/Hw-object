import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name = name;
    }

    public String getSurname() {
        return this.surname = surname;
    }

    public String toString() {
        return this.name+" "+this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        Author otherAuthor=(Author)obj;
        return this.name==otherAuthor.name && this.surname==otherAuthor.surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
