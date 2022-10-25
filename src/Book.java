public class Book {
    String bookName;
   String Author;
   private int publisherYear;

    public Book(String bookName, String Author, int publisherYear) {
        this.bookName=bookName;
        this.Author = Author;
        this.publisherYear = publisherYear;
    }
    public String getbookName () {
        return this.bookName;
    }

    public String getAuthor() {
        return this.Author;
    }
    public int getPublisherYear () {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear=publisherYear;
    }





}
