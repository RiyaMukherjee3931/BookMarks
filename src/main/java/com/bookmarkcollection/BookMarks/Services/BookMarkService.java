package com.bookmarkcollection.BookMarks.Services;

import com.bookmarkcollection.BookMarks.*;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class BookMarkService {

    @Autowired
    private BookMarkRepo repo;
    @Autowired
    private BookMarkMapper bookMarkMapper;

    @Transactional(readOnly = true)
    public DTO getAllbookmark(Integer pageNo){
        int page = pageNo < 1 ? 0 : pageNo-1;
        Pageable pageable = PageRequest.of(page,3, Sort.Direction.ASC,"createAt");
        Page<BookMarkDTO> bookMarkDTTO =  repo.findBookMarks(pageable);
        return new DTO(bookMarkDTTO);
    }
    @Transactional(readOnly = true)
    public DTO searchbookmark(String query, Integer pageNo) {
        int page = pageNo < 1 ? 0 : pageNo-1;
        Pageable pageable = PageRequest.of(page,3, Sort.Direction.ASC,"createAt");
       // Page<BookMarkDTO> bookMarkDTTO =  repo.searchBookMarks(query, pageable);
        Page<BookMarkDTO> bookMarkDTTO =  repo.findByTitleContainsIgnoreCase(query, pageable);
        return new DTO(bookMarkDTTO);
    }

    public BookMarkDTO createBookMark(@Valid CreateBookMarkRequest request) {
        BookMark bk = new BookMark(null, request.getTitle(), request.getUrl(), Instant.now());
        BookMark savedbookmark = repo.save(bk);
        return bookMarkMapper.toDTO(savedbookmark);
    }
}
