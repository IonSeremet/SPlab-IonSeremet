package com.example.designpatternslab;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Book> books = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        // Dummy logic to return a list of books
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        // Dummy logic to return a specific book by ID
        // You might want to check if the book with the given ID exists
        Book book = new Book(id, "Dummy Title", "Dummy Author");
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book newBook) {
        // Dummy logic to create a new book
        // You might want to validate and save the new book to your data source
        books.add(newBook);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        // Dummy logic to update an existing book by ID
        // You might want to validate and update the book in your data source
        Book existingBook = new Book(id, "Updated Title", "Updated Author");
        return new ResponseEntity<>(existingBook, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        // Dummy logic to delete a book by ID
        // You might want to validate and delete the book from your data source
        // For simplicity, just removing the book from the list
        books.removeIf(book -> book.getId().equals(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Dummy Book class for illustration
    private static class Book {
        private Long id;
        private String title;
        private String author;

        public Book(Long id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        public Long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}