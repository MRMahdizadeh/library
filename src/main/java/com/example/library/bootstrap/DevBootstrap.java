package com.example.library.bootstrap;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.Publisher;
import com.example.library.repositories.AuthorRepository;
import com.example.library.repositories.BookRepository;
import com.example.library.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("Reader's Zone");
        publisher.setAddress("Shariati Street, Tehran");
        publisher.setPhone("09991225222");

        publisherRepository.save(publisher);

        //amitGarg
        Author amitGarg = new Author("Amit", "Garg");
        Book jlbitc = new Book("Junior Level Books Introduction to Computer", "978-93-5019-561-1", publisher);
        amitGarg.getBooks().add(jlbitc);
        jlbitc.getAuthors().add(amitGarg);

        authorRepository.save(amitGarg);
        bookRepository.save(jlbitc);


        //lalitKumar
        Author lalitKumar = new Author("Lalit", "Kumar");
        Book pnl = new Book("Client Server Computing", "978-93-8067-432-2", publisher);
        lalitKumar.getBooks().add(pnl);
        pnl.getAuthors().add(lalitKumar);

        authorRepository.save(lalitKumar);
        bookRepository.save(pnl);
    }
}
