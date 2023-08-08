package com.example.projectboard.repository;

import com.example.projectboard.domain.*;
import org.springframework.data.jpa.repository.*;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment,Long> {
}
