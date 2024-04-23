package br.gov.sp.fatec.springboot3topicos.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3topicos.entity.Racao;
import br.gov.sp.fatec.springboot3topicos.repository.Racaorepository;

@Service
public class RacaoService {
    
    @Autowired
    private Racaorepository racaoRepo;

    public Racao cadastrarRacao(Racao racao) {
        if(racao.getData() == null){
            racao.setData(LocalDateTime.now());
        }

        return racaoRepo.save(racao);
    }

    public List<Racao> buscarTodasRacoes(){
        return racaoRepo.findAll();
    }

    public List<Racao> buscarRacaoPorHoraEstoque(LocalDateTime data, float estoque){
        return racaoRepo.buscarRacaoPorHoraEstoque(data,estoque);
    }
    
}
