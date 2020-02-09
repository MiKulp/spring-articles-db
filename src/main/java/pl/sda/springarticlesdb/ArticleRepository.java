package pl.sda.springarticlesdb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface ArticleRepository extends JpaRepository<Article, UUID> {

	Collection<Article> findByTitle(String title);
}
