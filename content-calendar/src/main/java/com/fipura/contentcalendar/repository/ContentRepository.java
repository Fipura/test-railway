package com.fipura.contentcalendar.repository;

import com.fipura.contentcalendar.model.Content;
import com.fipura.contentcalendar.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

        List<Content> findAllByTitleContains(String keyword);

        @Query("""
            SELECT c FROM Content c
            WHERE c.status = :status
        """)
        List<Content> listByStatus(@Param("status") Status status);

}
