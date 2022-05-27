package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	/*Exemplo 1 usando método do JPA*/
	List<Topico> findByCursoNome(String nomeCurso);
	
	/*Exemplo 2 usando @Query*/
	@Query("Select t from Topico t where t.curso.nome = :nomeCurso")
	List<Topico> acharCursoNome(String nomeCurso);

}
