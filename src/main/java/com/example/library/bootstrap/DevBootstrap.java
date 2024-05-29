//package com.example.library.bootstrap;
//
//import com.example.library.model.Author;
//import com.example.library.model.Book;
//import com.example.library.repositories.AuthorRepository;
//import com.example.library.repositories.BookRepository;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
//
//    private AuthorRepository authorRepository;
//    private BookRepository bookRepository;
//
//    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
//        this.authorRepository = authorRepository;
//        this.bookRepository = bookRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        initData();
//    }
//
//    private void initData() {
//        //MohammadReza
//        Author MohammadReza = new Author("MohammadReza","Mahdizadeh");
//        Book add = new Book("Domain Driven Design",)
//    }
//}
