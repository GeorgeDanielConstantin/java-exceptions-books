package org.lessons.java.library;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero di libri: ");
        int numberOfBooks = Integer.parseInt(scan.nextLine());

        Book[] catalogue = new Book[numberOfBooks];

        for (int i = 0; i < catalogue.length; i++) {

            boolean validBook = false;

            Book book = null;

            do {
                try {
                    System.out.print("Titolo: ");
                    String title = scan.nextLine();

                    System.out.print("Numero pagine: ");
                    int numberOfPages = Integer.parseInt(scan.nextLine());

                    System.out.print("Autore: ");
                    String author = scan.nextLine();

                    System.out.print("Editore: ");
                    String publisher = scan.nextLine();

                    book = new Book(title, numberOfPages, author, publisher);
                    validBook = true;
                } catch (InvalidBook e) {
                    System.out.println("Sono necessari titolo, numero di pagine, autore e editore");
                } catch (NumberFormatException ne) {
                    System.out.println("Invalid number");
                }
            } while (!validBook);

            catalogue[i] = book;
        }
        System.out.println(Arrays.toString(catalogue));
        scan.close();
    }
}
