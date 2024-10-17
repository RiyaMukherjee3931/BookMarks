package com.bookmarkcollection.BookMarks;

import com.bookmarkcollection.BookMarks.entities.BookMark;
import jakarta.persistence.Id;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookMarkRepo extends JpaRepository<BookMark, Integer> {

    @Query("select new com.bookmarkcollection.BookMarks.BookMarkDTO(b.id, b.title, b.Url, b.createAt) from BookMark b")
    Page<BookMarkDTO> findBookMarks(Pageable pageable);

    @Query(""" 
    select new com.bookmarkcollection.BookMarks.BookMarkDTO(b.id, b.title, b.Url, b.createAt) from BookMark b
    where lower(b.title) like lower(concat('%', :query, '%'))
    """)
    Page<BookMarkDTO> searchBookMarks(String query, Pageable pageable);

    Page<BookMarkDTO> findByTitleContainsIgnoreCase(String query, Pageable pageable);
}