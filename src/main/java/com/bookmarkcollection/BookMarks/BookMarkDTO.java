package com.bookmarkcollection.BookMarks;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookMarkDTO {

    private Integer id;
    private String title;
    private String Url;
    private Instant createAt;


}
