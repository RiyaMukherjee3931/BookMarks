package com.bookmarkcollection.BookMarks;

import com.bookmarkcollection.BookMarks.entities.BookMark;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DTO {

    private List<BookMarkDTO> data;
    private long totalElement;
    private int totalPages;
    private int currentPage;
    private boolean isFirst;
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public DTO(Page<BookMarkDTO> bookMarkPage){
        this.setData(bookMarkPage.getContent());
        this.setTotalElement(bookMarkPage.getTotalElements());
        this.setTotalPages(bookMarkPage.getTotalPages());
        this.setCurrentPage(bookMarkPage.getNumber()+1);
        this.setFirst(bookMarkPage.isFirst());
        this.setLast(bookMarkPage.isLast());
        this.setHasNext(bookMarkPage.hasNext());
        this.setHasPrevious(bookMarkPage.hasPrevious());

    }

}
