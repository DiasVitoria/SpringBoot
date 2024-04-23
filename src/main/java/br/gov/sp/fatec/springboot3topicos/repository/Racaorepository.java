package br.gov.sp.fatec.springboot3topicos.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springboot3topicos.entity.Racao;

public interface Racaorepository extends JpaRepository<Racao, Long> {
    
    @Query("select r from Racao r where r.data < ?1 or r.estoque < ?2")
    public List<Racao> buscarRacaoPorHoraEstoque(LocalDateTime data, float estoque);
}
