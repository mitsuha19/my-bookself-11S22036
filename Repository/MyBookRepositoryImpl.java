package Repository;

import Entity.MyBook;

import java.util.ArrayList;

public class MyBookRepositoryImpl implements MyBookRepository {
    ArrayList<MyBook> data = new ArrayList<MyBook>();

    @Override
    public ArrayList<MyBook> getAll() {
        return data;
    }

    @Override
    public MyBook get(int isbn) {
        return data.get(isbn);
    }

    @Override
    public void add(MyBook myBook) {
        data.add(myBook);
    }

    @Override
    public boolean remove(int isbn) {
        return false;
    }

    @Override
    public boolean updateReading(int isbn, int currentPages) {
        return true;
    }

    @Override
    public ArrayList<MyBook> getWithoutArchived() {
        return null;
    }

    @Override
    public ArrayList<MyBook> getOnlyArchived() {
         return null;
    }
    
    @Override
    public boolean updateArchived(int isbn, boolean isArchived) {
        for (MyBook myBook : data) {
            if(myBook.getIsbn() == isbn) {
                myBook.setArchived(isArchived);
                return true;
            }
        }  
        return false;
    }

}
