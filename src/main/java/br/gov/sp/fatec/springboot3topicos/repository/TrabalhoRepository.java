package br.gov.sp.fatec.springboot3topicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springboot3topicos.entity.Trabalho;

public interface TrabalhoRepository  extends JpaRepository<Trabalho, Long>{
    
    @Query("select t from Trabalho where t.titulo like %?1% and t.nota > ?2")
    public List<Trabalho> buscarTrabalhoPorTituloNota(String titulo, Integer nota);

}
