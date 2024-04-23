package br.gov.sp.fatec.springboot3topicos.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3topicos.entity.Racao;
import br.gov.sp.fatec.springboot3topicos.service.RacaoService;

@RestController
@RequestMapping(value = "/racao")
@CrossOrigin
public class RacaoController {

    @Autowired
    private RacaoService service;

    @GetMapping
    public List<Racao> getTodos() {
        return service.buscarTodasRacoes();
    }

    @PostMapping
    public Racao insert(@RequestBody Racao racao) {
        return service.cadastrarRacao(racao);
    }

    @GetMapping(value = "/{data}/estoque/{estoque}")
    public List<Racao> getPorDataEstoque(@PathVariable("data") LocalDateTime data, @PathVariable("estoque") float estoque){
        return service.buscarRacaoPorHoraEstoque(data, estoque);
    }
    
}
