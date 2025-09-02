package com.gestao.vagas.gestao_vagas.modules.candidate.useCases;

import com.gestao.vagas.gestao_vagas.exceptions.UserFoundException;
import com.gestao.vagas.gestao_vagas.modules.candidate.CandidateEntity;
import com.gestao.vagas.gestao_vagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired //Manage my repository
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRepository.save(candidateEntity);
    }

}
