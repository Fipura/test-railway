package com.fipura.contentcalendar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Content {
    @Id
    @SequenceGenerator(name = "content", sequenceName = "content_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "content")
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Type contentType;

    @FutureOrPresent
    private LocalDateTime dateCreated;

    @PastOrPresent
    private LocalDateTime dateUpdated;

    private String url;

    public Content(String title, String description, Status status, Type contentType, LocalDateTime dateCreated, LocalDateTime dateUpdated, String url) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.contentType = contentType;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.url = url;
    }
}
