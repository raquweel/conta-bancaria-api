package com.pactomais.conta_bancaria_api.service;

import com.pactomais.conta_bancaria_api.domain.Correntista;
import com.pactomais.conta_bancaria_api.repository.CorrentistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrentistaService {

    private final CorrentistaRepository correntistaRepository;
    //INJEÇÃO DE DEPENDÊNCIA
    public CorrentistaService(CorrentistaRepository correntistaRepository) {
        this.correntistaRepository = correntistaRepository;
    }

public Correntista cadastrar(Correntista correntista) {
        //Campos obrigatórios
        if (correntista.getNome() == null || correntista.getNome().trim().isEmpty()) {
            throw new RuntimeException("O nome do correntista é obrigatório.");
        }
        if (correntista.getDocumento() == null || correntista.getDocumento().trim().isEmpty()) {
            throw new RuntimeException("O documento é obrigatório.");
        }
        if (correntista.getDadosContato() == null || correntista.getDadosContato().trim().isEmpty()) {
            throw new RuntimeException("Os dados de contato são obrigatórios.");
        }

        // Validação de duplicidade de documento
        if (correntistaRepository.existsByDocumento(correntista.getDocumento())) {
            throw new RuntimeException("Já existe um correntista cadastrado com este documento.");
        }

        return correntistaRepository.save(correntista);
    }

    
}