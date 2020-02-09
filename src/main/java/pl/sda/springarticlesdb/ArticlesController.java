package pl.sda.springarticlesdb;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

	private ArticleRepository articleRepository;

	public ArticlesController(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	@PostMapping
	public Article createArticle(@RequestBody Article article) {
		article.setId(UUID.randomUUID());
		return articleRepository.save(article);
	}

	@GetMapping
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}

	@GetMapping(params = "title")
	public Collection<Article> getArticlesByName(@RequestParam(value =
		"title", required = true) String title) {
		return articleRepository.findByTitle(title);
	}
}
