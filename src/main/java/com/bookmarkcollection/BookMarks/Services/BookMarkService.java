package com.bookmarkcollection.BookMarks.Services;

import com.bookmarkcollection.BookMarks.BookMarkMapper;
import com.bookmarkcollection.BookMarks.BookMarkRepo;
import com.bookmarkcollection.BookMarks.DTO;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookMarkService {

    @Autowired
    private BookMarkRepo repo;

    private BookMarkMapper bookMarkMapper;


    public DTO getAllbookmark(Integer pageNo){
        int page = pageNo < 1 ? 0 : pageNo-1;
        Pageable pageable = PageRequest.of(page,3, Sort.Direction.ASC,"createAt");
        return new DTO(repo.findAll(pageable).map(bookMarkMapper::toDTO));
    }
}
