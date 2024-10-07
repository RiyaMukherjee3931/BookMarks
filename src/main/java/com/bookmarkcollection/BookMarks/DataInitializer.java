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

        repos.save(new BookMark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        repos.save(new BookMark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        repos.save(new BookMark(null, "Quarkus", "https://quarkus.io", Instant.now()));
        repos.save(new BookMark(null, "Micronaut", "https://micronaut.io", Instant.now()));
        repos.save(new BookMark(null, "JOOQ", "https://jooq.org", Instant.now()));
        repos.save(new BookMark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        repos.save(new BookMark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        repos.save(new BookMark(null, "Quarkus", "https://quarkus.io", Instant.now()));
        repos.save(new BookMark(null, "Micronaut", "https://micronaut.io", Instant.now()));
        repos.save(new BookMark(null, "JOOQ", "https://jooq.org", Instant.now()));

    }
}
