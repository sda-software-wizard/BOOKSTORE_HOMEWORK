package pl.sda.homework;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class BookStore {

    private final Set<Book> bookCollection;
    private final Map<Book, Integer> bookStorage; // Magazyn ->> klucz książka (equals autor+tytuł) wartość - ilość sztuk w magazynie

    public BookStore() {
        Book book1 = new Book("Jakub Ćwiek", "Kłamca", 7.5);
        Book book2 = new Book("Jarosław Grzędowicz", "Pan Lodowego Ogrodu TOM 1", 8.3);
        Book book3 = new Book("Andrzej Sapkowski", "Pani Jeziorna", 1.0);
        Book book4 = new Book("Marcin Przybyłek", "Gamedec Zabaweczki", 7.1);
        Book book5 = new Book("Brent Weeks", "Czarny Pryzmat", 9.9);
        Book book6 = new Book("Brent Weeks", "Droga Cienia", 9.8);

        bookCollection = new HashSet<>();
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);
        bookCollection.add(book6);



        bookStorage = new HashMap<>();
        bookStorage.put(book1, 7);
        bookStorage.put(book2, 3);
        bookStorage.put(book3, 11);
        bookStorage.put(book4, 22);
        bookStorage.put(book5, 9);
        bookStorage.put(book6, 47);
    }

    int collectionSize(){ // metoda pomocna do junitów - nie potrzebna do działania programu
        return bookCollection.size();
    }

    public void showBookCollection() {
//        bookCollection.forEach(System.out::println); //->> java 8 lambda skrócona
//        bookCollection.forEach(book -> System.out.println(book));// ->> java 8 lambda
        for (Book book : bookCollection) { // pętla foreach -> iterujemy każdy element, ale nie mamy wiedzy która jest to iteracja
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        //dodać książkę do kolekcji
        bookCollection.add(book);
        // TODO dla chętnych - jesli dodajemy do kolekcji książek nową pozycje to w magazynie powinna pojawić się taka z ilością 0.
        System.out.println("Dodano nową książkę do kolekcji: " + book);
    }
}
