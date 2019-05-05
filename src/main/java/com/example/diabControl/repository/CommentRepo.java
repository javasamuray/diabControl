package com.example.diabControl.repository;

import com.example.diabControl.domain.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comment,Long> {
    List<Comment> findByTag(String tag);
}
