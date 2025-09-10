package com.gestao.vagas.gestao_vagas.modules.candidate;

import com.gestao.vagas.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID>{
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);

    Optional<CompanyEntity> findByUsername(String username);
}
