public class Book {
    String name;
    Author author;
    int yearPublish;

    public Book(String name, Author person, int yearPublish) {
        this.name = name;
        this.author = author;
        this.yearPublish = yearPublish;
    }
    public String getName() {
        return this.name=name;
    }
    public Author getAuthor(){
        return this.author=author;
    }
    public int getYearPublish() {
        return this.yearPublish=yearPublish;
    }
    public void setYearPublish(int yearPublish) {
        this.yearPublish=yearPublish;
    }
}
