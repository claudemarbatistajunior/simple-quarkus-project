package org.acme.http;

import org.acme.entity.Book;
import org.acme.service.BookService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookAPI {

    @Inject
    private BookService service;

    @Path("/{id}")
    @GET
    public Book getBook(@PathParam("id") String id) {
        return service.getBook(UUID.fromString(id));
    }

    @GET
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @Transactional
    @PUT
    public Book saveBook(Book book) {
        return service.saveBook(book);
    }

    @Transactional
    @Path("/{id}")
    @DELETE
    public void deleteBook(@PathParam("id") String id) {
        service.deleteBook(UUID.fromString(id));
    }

}