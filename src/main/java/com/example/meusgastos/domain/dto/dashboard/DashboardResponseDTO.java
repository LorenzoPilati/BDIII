package com.example.meusgastos.domain.dto.dashboard;

import java.util.List;

import com.example.meusgastos.domain.dto.titulo.TituloResponseDTO;

public class DashboardResponseDTO {
    private Double totalPagar;
    private Double totalReceber;
    private Double saldo;
    private List<TituloResponseDTO> titulosPagar;
    private List<TituloResponseDTO> titulosReceber;
    
    public DashboardResponseDTO(){

    }

    public DashboardResponseDTO(Double totalPagar, Double totalReceber, Double saldo, List<TituloResponseDTO> titulosPagar, List<TituloResponseDTO> titulosReceber){
        this.totalPagar = totalPagar;
        this.totalReceber = totalReceber;
        this.saldo = saldo;
        this.titulosPagar = titulosPagar;
        this.titulosReceber = titulosReceber;
    }
    
    public Double getTotalPagar() {
        return totalPagar;
    }
    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }
    public Double getTotalReceber() {
        return totalReceber;
    }
    public void setTotalReceber(Double totalReceber) {
        this.totalReceber = totalReceber;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public List<TituloResponseDTO> getTitulosPagar() {
        return titulosPagar;
    }
    public void setTitulosPagar(List<TituloResponseDTO> tituloPagar) {
        this.titulosPagar = tituloPagar;
    }
    public List<TituloResponseDTO> getTitulosReceber() {
        return titulosReceber;
    }
    public void setTitulosReceber(List<TituloResponseDTO> tituloReceber) {
        this.titulosReceber = tituloReceber;
    }
    
    
}
