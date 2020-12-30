package com.zb.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class Book {
    private Integer id;

    private String bookname;

    private String author;

    private Date releasedate;

    private Long price;

}