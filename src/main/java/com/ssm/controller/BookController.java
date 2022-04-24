package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LISHANSHAN
 * @ClassName BookController
 * @Description TODO
 * @date 2022/04/2022/4/17 14:27
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BooksServiceImpl")
    BooksService booksService;

    @RequestMapping("/allBooks")
    public String getAllBooks(Model model) {

        List<Books> list = booksService.selectAllBooks();
        model.addAttribute("list", list);

        return "allBooks";
    }

    @RequestMapping("/toAddBooks")
    public String toAddBooks() {
        return "addBooks";
    }

    @RequestMapping("/addBooks")
    public String addBooks(Books books) {
        booksService.insertBooks(books);
        return "redirect:allBooks";
    }

    @RequestMapping("/toUpdateBooks/{bookId}")
    public String toUpdateBooks(@PathVariable("bookId") Integer bookId, Model model) {
        Books books = booksService.selectBookById(bookId);
        System.out.println(books);
        model.addAttribute("books", books);

        return "updateBooks";
    }

    @RequestMapping("/updateBooks")
    public String updateBooks(Books books) {
        booksService.updateBooks(books);
        System.out.println(books);
        return "redirect:allBooks";
    }

    @RequestMapping("/deleteBooks/{bookId}")
    public String deleteBooks(@PathVariable("bookId") Integer bookId) {
        booksService.deleteBooks(bookId);
        return "redirect:allBooks";
    }

    @RequestMapping("/queryBook")
    public String queryByName(String bookName, Model model) {
        List<Books> list = new ArrayList<>();
        Books books = booksService.selectBookByName(bookName);
        if (books == null) {
            list = booksService.selectAllBooks();
            model.addAttribute("error", "未查到");
        } else {
            list.add(books);
            model.addAttribute("list", list);
        }
        return "allBooks";
    }
}
