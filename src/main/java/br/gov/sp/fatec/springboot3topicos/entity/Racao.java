package br.gov.sp.fatec.springboot3topicos.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rac_racao")
public class Racao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rac_id")
    private Long id;

    @Column(name = "rac_nome")
    private String nome;

    @Column(name = "rac_data_hora_ultima_compra")
    private LocalDateTime data;

    @Column(name = "rac_estoque")
    private float estoque;

    @Column(name = "rac_avaliacao")
    private Integer avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getEstoque() {
        return estoque;
    }

    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }
    


}
