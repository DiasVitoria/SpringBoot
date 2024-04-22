package br.gov.sp.fatec.springboot3topicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3topicos.entity.Trabalho;
import br.gov.sp.fatec.springboot3topicos.repository.TrabalhoRepository;

@Service // nao esquecer do @service
public class TrabalhoService {

    @Autowired // serve para instaciar a classe TrabalhoRepository
    private TrabalhoRepository trabalhoRepo;

    public Trabalho cadastrarTrabalho(Trabalho trabalho) {

        return trabalhoRepo.save(trabalho);
    }

    public List<Trabalho> buscarTodosTrabalhos() {
        return trabalhoRepo.findAll();
    }

    public Optional<Trabalho> buscarTrabalhoPorId(Long Id) {
        return trabalhoRepo.findById(Id);
    }
}
