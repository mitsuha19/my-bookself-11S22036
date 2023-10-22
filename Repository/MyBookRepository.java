package Repository;

import Entity.MyBook;

import java.util.ArrayList;

public interface MyBookRepository {
    public ArrayList<MyBook> getAll();
    public MyBook get(int isbn);
    public void add(MyBook myBook);
    public boolean remove(int isbn);
    public boolean updateReading(int isbn, int currentPages);

}
