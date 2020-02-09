package pl.sda.springarticlesdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {

	@Id
	private UUID id;
	private String title;
	private String content;
	private String author;
}
