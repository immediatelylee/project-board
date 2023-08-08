package com.example.projectboard.repository;

import com.example.projectboard.domain.*;
import org.springframework.data.jpa.repository.*;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
