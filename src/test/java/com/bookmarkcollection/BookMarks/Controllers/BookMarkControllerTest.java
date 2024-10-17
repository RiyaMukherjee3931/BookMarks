package com.bookmarkcollection.BookMarks.Controllers;

import com.bookmarkcollection.BookMarks.DTO;
import com.bookmarkcollection.BookMarks.Services.BookMarkService;
import org.h2.command.dml.MergeUsing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(BookMarkController.class)
class BookMarkControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookMarkService bookMarkService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void getAlltheBookmark() throws Exception {
        DTO dto1 = new DTO();
        Mockito.when(bookMarkService.getAllbookmark(1)).thenReturn(dto1);
        mockMvc.perform(get("/getAll")
                .param("pageNo","1")
                .param("query","")).andExpect(status().isOk());

    }
}