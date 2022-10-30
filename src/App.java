public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Alexandr", "Pushkin");
        Author author2 = new Author("Nikolay", "Gogol");
        Book book1 = new Book("Onegin", author1, 1830);
        Book book2 = new Book("Grom", author2, 1832);
        System.out.println("book2.getPublisherYear() = " + book2.getPublisherYear());
        book2.setPublisherYear(1834);
        System.out.println("book2.getPublisherYear() = " + book2.getPublisherYear());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());


    }
}
