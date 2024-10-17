package com.bookmarkcollection.BookMarks;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookMarkRequest {

    @NotEmpty(message = "title should not be empty")
    private String title;
    @NotEmpty(message = "title should not be empty")
    private String Url;
}
