package com.bookmarkcollection.BookMarks;
import com.bookmarkcollection.BookMarks.*;
import com.bookmarkcollection.BookMarks.entities.BookMark;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.Instant;


@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {


    private final BookMarkRepo repos;

    @Override
    public void run(String... args) throws Exception {

        repos.save(new BookMark(1,"Fav URL","https://www.youtube.com/watch?v=UhEM", Instant.now()));
    }
}
