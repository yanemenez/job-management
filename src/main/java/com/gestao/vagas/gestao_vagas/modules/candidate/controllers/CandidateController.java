package com.gestao.vagas.gestao_vagas.modules.candidate.controllers;

import com.gestao.vagas.gestao_vagas.modules.candidate.CandidateEntity;
import com.gestao.vagas.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired //Manage my repository
    private CandidateRepository candidateRepository;

    @PostMapping("/")
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
        return this.candidateRepository.save(candidateEntity);
    }
}