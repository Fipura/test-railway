/*
package com.fipura.contentcalendar.config;

import com.fipura.contentcalendar.model.Content;
import com.fipura.contentcalendar.model.Status;
import com.fipura.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    public void init() {
        Content c = new Content("My First Blod Post", "My First Blog Post", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), LocalDateTime.now(), "");
        contentList.add(c);
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
*/
