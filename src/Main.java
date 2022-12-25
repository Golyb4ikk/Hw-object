public class Main {
    public static void main(String[] args) {
        Author first= new Author("Conan","Varvar");
        Author second= new Author("My","Dog");
        Book one=new Book("Ballada",first,2012);
        Book two=new Book("Story",second,2048);
        System.out.println(one.getName()+" "+first.getName()+" "+first.getSurname()+" "+one.getYearPublish());
        System.out.println(two.getName()+" "+second.getName()+" "+second.getSurname()+" "+two.getYearPublish());
        one.setYearPublish(2047);
        System.out.println(one.getYearPublish());


    }
}