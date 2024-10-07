package com.bookmarkcollection.BookMarks;

import com.bookmarkcollection.BookMarks.entities.BookMark;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class BookMarkMapper {

    public BookMarkDTO toDTO(BookMark bm){
        BookMarkDTO dto = new BookMarkDTO();
        dto.setId(bm.getId());
        dto.setTitle(bm.getTitle());
        dto.setUrl(bm.getUrl());
        dto.setCreateAt(bm.getCreateAt());
        return dto;
    }
}
