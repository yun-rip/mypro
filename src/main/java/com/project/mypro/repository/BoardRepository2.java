package com.project.mypro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mypro.model.Board2;

public interface BoardRepository2 extends JpaRepository<Board2, Long>{

    List<Board2> findByTitle(Long title);
    List<Board2> findByTitleOrContent(Long title, String content);
}
