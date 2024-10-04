package com.bookmarkcollection.BookMarks.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Entity
@Table(name="bookmarks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookMark {

    @Id
    @SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String Url;
    private Instant createAt;


}
