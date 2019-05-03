package service;

import domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import repository.MockRepository;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockServiceTest{
    @Mock
    private MockRepository mockRepository;

    @InjectMocks
    private MockService mockService;


    @Test
    public void bookName_Cinderella_verify(){
        Book book = mock(Book.class);

        book.setName("Cinderella");
        book.setAuthor("CharlesPerrault");
        book.setPrice(10000);

        verify(book,times(1)).setName(anyString());
    }

    @Test
    public void book_store_bookSize_verify(){
        List<Book> books = mock(ArrayList.class);

        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);

        book1.setName("Cinderella");
        book1.setAuthor("CharlesPerrault");
        book1.setPrice(10000);

        books.add(book1);

        book2.setName("WinnieThePooh");
        book2.setAuthor("AlanAlexanderMilne");
        book2.setPrice(15000);

        books.add(book2);

        System.out.println(books.size());

        verify(books, times(1)).size();

    }




}