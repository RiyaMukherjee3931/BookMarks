package com.bookmarkcollection.BookMarks;

import com.bookmarkcollection.BookMarks.entities.BookMark;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepo extends JpaRepository<BookMark, Integer> {


}