package com.springweb.study.repository;

import com.springweb.study.domain.Article;
import com.springweb.study.dto.article.ArticleResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {
	@Query("SELECT a FROM Article a WHERE a.title LIKE %:title%")
	Page<ArticleResponse> findByTitleContaining(@Param("title") String title, Pageable pageable);
}
