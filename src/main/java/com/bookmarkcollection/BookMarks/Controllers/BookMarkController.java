package com.bookmarkcollection.BookMarks.Controllers;

import com.bookmarkcollection.BookMarks.BookMarkDTO;
import com.bookmarkcollection.BookMarks.CreateBookMarkRequest;
import com.bookmarkcollection.BookMarks.DTO;
import com.bookmarkcollection.BookMarks.Services.BookMarkService;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookMarkController {

    @Autowired
    public BookMarkService service;

    @GetMapping("/getAll")
    public DTO getAlltheBookmark(@RequestParam(name = "page",defaultValue = "1")Integer pageNo,
                                 @RequestParam(name = "query",defaultValue = "")String query){

        if(query == null || query.trim().length() == 0){
            return service.getAllbookmark(pageNo);
        }

        return service.searchbookmark(query, pageNo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookMarkDTO createBookMark(@RequestBody @Valid CreateBookMarkRequest request){
         return service.createBookMark(request);
    }
}
