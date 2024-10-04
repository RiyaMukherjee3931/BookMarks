package com.bookmarkcollection.BookMarks;

import org.springframework.boot.SpringApplication;

public class TestBookMarksApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookMarksApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
