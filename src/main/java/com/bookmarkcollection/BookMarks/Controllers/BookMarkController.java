package com.bookmarkcollection.BookMarks.Controllers;

import com.bookmarkcollection.BookMarks.Services.BookMarkService;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BookMarkController {

    @Autowired
    public BookMarkService service;

    @GetMapping("/getAll")
    public List<BookMark> getAlltheBookmark(){
        return service.getAllbookmark();
    }
}
