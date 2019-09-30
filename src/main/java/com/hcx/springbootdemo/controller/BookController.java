package com.hcx.springbootdemo.controller;

import com.hcx.springbootdemo.model.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    private BookProperties bookProperties;

    @RequestMapping(value = {"/bookInfo","/API"},method = RequestMethod.GET)
    public BookProperties showBookInfo( Integer id){
        System.out.println(bookProperties);
        System.out.println(id);
        return bookProperties;
    }
}
