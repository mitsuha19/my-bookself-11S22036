package Service;

public interface MyBookService {
    public boolean readingMyBook(int isbn);
    public void showMyBook();
    public void addMyBook(int isbn, String title, String author, String publisher, int year, int totalPages);
    public void removeMyBook(int isbn);
    public void updateReadingMyBook(int isbn, int currentPages);
}
