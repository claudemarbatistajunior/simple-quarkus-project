package org.acme.service;

import org.acme.entity.Book;
import org.acme.repository.BookRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class BookService {

    @Inject
    private BookRepository bookRepository;

    public Book getBook(UUID id) {
        return bookRepository.findById(id);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll().list();
    }

    public Book saveBook(Book book) {
        bookRepository.persist(book);
        return book;
    }

    public void deleteBook(UUID id) {
        bookRepository.deleteById(id);
    }

}
