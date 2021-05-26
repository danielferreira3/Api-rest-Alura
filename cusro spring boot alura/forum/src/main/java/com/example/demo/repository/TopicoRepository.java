package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//filtrando por um atributo de relacionamento
	List<Topico> findByCursoNome(String nomeCurso);
	
	//montando a Query manual
	//@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param ("nomeCurso")String nomeCurso);

}
