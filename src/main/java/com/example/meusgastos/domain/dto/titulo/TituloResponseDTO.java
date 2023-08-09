package com.example.meusgastos.domain.dto.titulo;

import java.util.Date;
import java.util.List;

import com.example.meusgastos.domain.Enum.ETipoTitulo;
import com.example.meusgastos.domain.dto.centrodecusto.CentroDeCustoResponseDTO;

public class TituloResponseDTO {
    
    private Long id;
    private String descricao;
    private ETipoTitulo tipo;
    private List<CentroDeCustoResponseDTO> centroDeCustos;
    private Double valor;
    private Date dataCadastro;
    private Date dataReferencia;
    private Date dataPagamento;
    private String observacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ETipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(ETipoTitulo tipo) {
        this.tipo = tipo;
    }

    public List<CentroDeCustoResponseDTO> getCentroDeCustos() {
        return centroDeCustos;
    }

    public void setCentroDeCustos(List<CentroDeCustoResponseDTO> centroDeCustos) {
        this.centroDeCustos = centroDeCustos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(Date dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
