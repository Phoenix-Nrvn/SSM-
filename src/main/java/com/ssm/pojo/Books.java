package com.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LISHANSHAN
 * @ClassName Books
 * @Description TODO
 * @date 2022/04/2022/4/13 22:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;
}
