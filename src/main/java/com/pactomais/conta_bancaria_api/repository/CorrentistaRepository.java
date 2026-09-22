package com.pactomais.conta_bancaria_api.repository;

import com.pactomais.conta_bancaria_api.domain.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {

}
