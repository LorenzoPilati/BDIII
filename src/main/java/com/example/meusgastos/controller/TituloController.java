package com.example.meusgastos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meusgastos.domain.dto.titulo.TituloRequestDTO;
import com.example.meusgastos.domain.dto.titulo.TituloResponseDTO;
import com.example.meusgastos.domain.service.TituloService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/titulos")
public class TituloController {
    @Autowired
    private TituloService tituloService;

    @GetMapping
    public ResponseEntity<List<TituloResponseDTO>> obterTodos(){
        return ResponseEntity.ok(tituloService.obterTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TituloResponseDTO> obterPorId(@PathVariable Long id){
        return ResponseEntity.ok(tituloService.obterPorId(id));
    }

    @PostMapping
    public ResponseEntity<TituloResponseDTO> cadastrar(@RequestBody TituloRequestDTO dto){
        TituloResponseDTO responseDTO = tituloService.cadastrar(dto);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TituloResponseDTO> atualizar(@PathVariable Long id, @RequestBody TituloRequestDTO dto){
        TituloResponseDTO responseDTO = tituloService.atualizar(id, dto);
        return ResponseEntity.ok(responseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){
        tituloService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
