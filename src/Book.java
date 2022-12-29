import java.util.Objects;

public class Book {
     private String name;
    private Author author;
    int yearPublish;

    public Book(String name, Author author, int yearPublish) {
        this.name = name;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public String getName() {
        return this.name = name;
    }

    public Author getAuthor() {
        return this.author = author;
    }

    public int getYearPublish() {
        return this.yearPublish = yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public String toString() {
    return "Имя "+this.name+" Автор "+this.author+" Год издания "+this.yearPublish;
    }
    @Override
    public boolean equals(Object obj) {
        Book otherBook=(Book)obj;
        return this.name==otherBook.name && this.author==otherBook.author && this.yearPublish==otherBook.yearPublish;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublish);
    }
}
