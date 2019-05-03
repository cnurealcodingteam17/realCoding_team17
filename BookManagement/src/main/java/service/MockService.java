package service;

import domain.Book;
import repository.MockRepository;

import java.util.List;

public class MockService {
    private final MockRepository mockRepository;
    //이게 mock역할을 해줘야한다.
    public MockService(MockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }

    public List<Book> findAllBook() {
        return mockRepository.findAll();
    }

    public Book findByName(String name) {
        Book book = mockRepository.findByName(name);
        return book;
    }

    public Book updatePrice_ByName(String book_name, int price){
        Book book = findByName(book_name);
        book.setPrice(price);
        return book;
    }

}