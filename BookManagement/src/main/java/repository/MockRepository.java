package repository;

import domain.Book;

import java.util.List;

public interface MockRepository {
    List<Book> findAll();

    Book findByName(String book_name);

    Book updateAuthorByName(String book_name, String author);

    void addBook(Book book);
}
