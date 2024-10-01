package com.company;

import java.util.ArrayList;

/*
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */
class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}

public class CWH_Exercise_7 {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms", "CLRS");
        bk.add(b1);

        Book b2 = new Book("Algorithms2", "CLRS2");
        bk.add(b2);

        Book b3 = new Book("Algorithms3", "CLRS3");
        bk.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4");
        bk.add(b4);
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, "Harry");
        System.out.println(l.books);

    }
}
