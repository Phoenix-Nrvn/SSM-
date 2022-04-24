package com.ssm.service;

import com.ssm.mapper.BooksMapper;
import com.ssm.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LISHANSHAN
 * @ClassName BooksServiceImpl
 * @Description TODO
 * @date 2022/04/2022/4/13 23:06
 */
@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    BooksMapper booksMapper;

    @Override
    public int insertBooks(Books book) {
        return booksMapper.insertBooks(book);
    }

    @Override
    public int deleteBooks(Integer id) {
        return booksMapper.deleteBooks(id);
    }

    @Override
    public int updateBooks(Books book) {
        return booksMapper.updateBooks(book);
    }

    @Override
    public Books selectBookById(Integer id) {
        return booksMapper.selectBookById(id);
    }

    @Override
    public Books selectBookByName(String name) {
        return booksMapper.selectBookByName(name);
    }

    @Override
    public List<Books> selectAllBooks() {
        return booksMapper.selectAllBooks();
    }

    public BooksMapper getBooksMapper() {
        return booksMapper;
    }

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }
}
