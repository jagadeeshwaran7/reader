package com.reader.reader.controller;

import com.reader.reader.models.Book;
import com.reader.reader.services.BookServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("books")
@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookServices bookServices;

    @GetMapping("/getall")
    public List<Book> getAllBooks() {
        return bookServices.getAllBooks();
    }
    @GetMapping("/name={name}")
    public Object getBookByName(@PathVariable("name") String bookName) {
        Book response = bookServices.getBookByName(bookName);
        if (response == null) {
            return "Book not found";
        } else {
            return response;
        }
    }
    @PutMapping("/publishbook")
    public void createAbook(@RequestBody Book book) {
        bookServices.createBook(book);
    }
}
