package com.company;

// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class Library {
    String[] books;
    int noOfBooks;

    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String e : this.books) {
            if (e == null) {
                continue;
            }
            System.out.println("* " + e);
        }
    }

    void issueBook() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals("C++")) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook() {
        addBook("C++");
    }
}


public class CWH_Exercise_4 {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook();
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook();
        centralLibrary.showAvailableBooks();
    }
}
