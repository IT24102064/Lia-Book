package com.lia.books;
import com.lia.books.Book;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    // Get all books
    @GetMapping
    public List<Book> getBooks() {
        return bookList;
    }

    // Add a new book
    @PostMapping
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully";
    }

    // Remove a book
    @DeleteMapping("/{title}")
    public String removeBook(@PathVariable String title) {
        bookList.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        return "Book removed successfully";
    }

    // Search for books by title
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}

