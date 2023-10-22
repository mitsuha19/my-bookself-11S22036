package View;

import Service.MyBookService;
import Util.InputUtil;

public class MyBookView {
    private MyBookService myBookService;
    private int viewMode;

    public MyBookView (MyBookService myBookService){
        this.myBookService = myBookService;
    }

    public void showMybook() {
        while (true) {
            myBookService.showMyBook();

            System.out.println("Menu :");
            System.out.println("1. Mode Tampilan");
            System.out.println("2. Tambah");
            System.out.println("3. Membaca");
            System.out.println("4. Mengarsipkan");
            System.out.println("5. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");
            System.out.println();
            var stop = false;
            switch (input) {
                
                case "2" -> addMyBook();
                case "3" -> readingMyBook();
                case "5" -> removeMyBook();
                case"x" -> stop = true;
                default -> System.out.println("Pilihan tidak dimengerti");
            }

            if (stop) {
                break;
            }

            System.out.println();
        }
    }

    public void addMyBook() {
        System.out.println("Menambah My Book");
        var judul = InputUtil.input("Judul (x Jika Batal)");
        if (judul.equals("x")) {
            System.out.println("Tindakan dibatalkan");
            System.out.println();
        } else {
            var isbn = InputUtil.input("ISBN");
            var penulis = InputUtil.input("Penulis");
            var penerbit = InputUtil.input("Penerbit");
            var Tahun = InputUtil.input("Tahun Terbit");
            var halaman = InputUtil.input("Jumlah Halaman");

            int year = Integer.parseInt(Tahun);
            int isbnnumber = Integer.parseInt(isbn);
            int hal = Integer.parseInt(halaman);
            System.out.println();
            myBookService.addMyBook(isbnnumber, judul, penulis, penerbit, year, hal);
        }
    }

    public void readingMyBook() {
        System.out.println("Membaca My Book");
        var isbn = InputUtil.input("ISBN (x Jika Batal)");

    }

    public void removeMyBook() {

    }
}
