package pl.sda.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();

        while (true) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl kolekcje książek (bez jakiegokolwiek sortowania)");
            System.out.println("2. Dodaj książkę do kolekcji");
            System.out.println("3. Usuń książkę z kolekcji");
            System.out.println("4. Usuń wszystkie książki autora z kolekcji");
            System.out.println("5. Wyświetl kolekcje książek posortowaną po tytule");
            System.out.println("6. Wyświetl kolekcje książek posortowaną po autorze");
            System.out.println("7. Wyświetl kolekcje książek posortowaną od najlepsze do najgorszej");
            System.out.println("8. Wyświet wszystkie kolekcje książek podanego autora posortowane po tytule");
            System.out.println("9. Wyświet wszystkie kolekcje książek podanego autora posortowane po ocenie");
            System.out.println();
            System.out.println("10. Przyjmij partię książki na magazyn");
            System.out.println("11. Sprzedaj książkę (zdejmij z magazynu)");
            System.out.println("12. Wyświetl stan magazynowy posortowany po ilości książek (rosnąco)");
            System.out.println("13. Wyświetl stan magazynowy książek, których jest mniej niż 10 posortowanych po ilości książek (rosnąco)");
            System.out.println("14. Zakończ program");


            int chosenOption = scanner.nextInt();
            scanner.nextLine();
            switch (chosenOption) {
                case 1:
                    bookStore.showBookCollection();
                    break;

                case 2:
                    System.out.println("Wprowadź nową książkę w formacie: Autor, Tytuł, ocena"); // TODO zadanie dodatkowe sprawić by można było dodać książkę bez oceny
                    String[] chopedBook = scanner.nextLine().split(",");
                    Book newBook = new Book(chopedBook[0], chopedBook[1], Double.parseDouble(chopedBook[2]));
                    bookStore.addBook(newBook);
                    break;
                case 14: System.exit(200);

                default:
                    System.out.println("Wybrana została niepoprawna opcja, spróbuj ponownie");
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}