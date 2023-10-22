package Service;

import Entity.MyBook;
import Repository.MyBookRepository;

import java.util.ArrayList;

public class MyBookServiceImpl implements MyBookService {

    private MyBookRepository myBookRepository;
    public MyBookServiceImpl (MyBookRepository myBookRepository){
        this.myBookRepository = myBookRepository;
    }
    @Override
    public void showMyBook() {
        ArrayList<MyBook> model = myBookRepository.getAll();

        System.out.println("My Book (Semua) :");
        if (model.size() > 0) {
            for (int i = 0; i < model.size() ; i++) {
                var mybook = model.get(i);

                if (mybook != null) {
                    System.out.println(mybook.getIsbn() + ". " + mybook.getTitle() + " [" + mybook.getCurrentPages() + "/" + mybook.getTotalPages() + "]");
                }
            }
        } else {
            System.out.println("Belum ada daftar buku yang tersedia");
        }
        System.out.println();
    }

    @Override
    public boolean readingMyBook(int isbn) {
        return false;
    }

    @Override
    public void addMyBook(int isbn, String title, String author, String publisher, int year, int totalPages) {
        MyBook isexixt = null;
        for (MyBook myBook : myBookRepository.getAll()) {
            if (myBook.getIsbn() == isbn) {
                isexixt = myBook;
                break;
            }
        }
        MyBook myBook = new MyBook(isbn,title,author,publisher,year,totalPages);
        if (isexixt != null) {
            System.out.println("GAGAL MENAMBAH MY BOOK : isbn " + myBook.getIsbn() + " telah tersedia");
        } else {
            myBookRepository.add(myBook);
            System.out.println("SUKSES MENAMBAH MY BOOK : " + myBook.getTitle() + " dengan isbn " + myBook.getIsbn());
        }
    }



    @Override
    public void removeMyBook(int isbn) {

    }

    @Override
    public void updateReadingMyBook(int isbn, int currentPages) {

    }

}
