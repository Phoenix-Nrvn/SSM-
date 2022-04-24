package com.ssm.service;

import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc TODO
 * @author LISHANSHAN
 * @InterfaceName BooksService
 * @date 2022/04/2022/4/13 23:04
 */
public interface BooksService {


    /**
     * Desc: 插入数据
     * @param book
     * @return {@link int}
     * @author LISHANSHAN
     * @date 2022/4/13 22:44
     */
    int insertBooks(Books book);

    /**
     * Desc: 删除数据
     *
     * @param id
     * @return {@link int}
     * @author LISHANSHAN
     * @date 2022/4/13 22:45
     */
    int deleteBooks(@Param("bookId") Integer id);

    /**
     * Desc: 修改数据
     *
     * @param book
     * @return {@link int}
     * @author LISHANSHAN
     * @date 2022/4/13 22:46
     */
    int updateBooks(Books book);

    /**
     * Desc: 通过id查询数据
     *
     * @param id
     * @return {@link Books}
     * @author LISHANSHAN
     * @date 2022/4/13 22:47
     */
    Books selectBookById(@Param("bookId") Integer id);

    /**
     * Desc: 通过名称查询数据
     *
     * @param name
     * @return {@link Books}
     * @author LISHANSHAN
     * @date 2022/4/13 22:49
     */
    Books selectBookByName(@Param("bookName") String name);

    /**
     * Desc: 获取全部数据
     *
     * @param
     * @return {@link List < Books>}
     * @author LISHANSHAN
     * @date 2022/4/13 22:49
     */
    List<Books> selectAllBooks();
}
