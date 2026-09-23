package com.pactomais.conta_bancaria_api.controller;

import com.pactomais.conta_bancaria_api.domain.Correntista;
import com.pactomais.conta_bancaria_api.service.CorrentistaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    private final CorrentistaService correntistaService;

    // Injeção de dependência do Service 
    public CorrentistaController(CorrentistaService correntistaService) {
        this.correntistaService = correntistaService;
    }

    // Endpoint para Cadastrar: POST http://localhost:8080/correntistas
    @PostMapping
    public ResponseEntity<Correntista> cadastrar(@RequestBody Correntista correntista) {
        Correntista novoCorrentista = correntistaService.cadastrar(correntista);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCorrentista);
    }

    // Endpoint para Listar Todos: GET http://localhost:8080/correntistas
    @GetMapping
    public ResponseEntity<List<Correntista>> listarTodos() {
        return ResponseEntity.ok(correntistaService.listarTodos());
    }

    // Endpoint para Buscar por ID: GET http://localhost:8080/correntistas/1
    @GetMapping("/{id}")
    public ResponseEntity<Correntista> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(correntistaService.buscarPorId(id));
    }

}
