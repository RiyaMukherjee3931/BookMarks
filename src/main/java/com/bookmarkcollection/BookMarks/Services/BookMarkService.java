package com.bookmarkcollection.BookMarks.Services;

import com.bookmarkcollection.BookMarks.BookMarkRepo;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookMarkService {

    @Autowired
    private BookMarkRepo repo;


    public List<BookMark> getAllbookmark(){
        return repo.findAll();
    }
}
