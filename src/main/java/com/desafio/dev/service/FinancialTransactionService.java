package com.desafio.dev.service;

import com.desafio.dev.model.FinancialTransaction;
import com.desafio.dev.repository.FinancialTransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FinancialTransactionService {

    @Autowired
    private FinancialTransactionRepository financialTransactionRepository;

    public List<FinancialTransaction> normalizeFile(MultipartFile multipartFile) {
        return new ArrayList<>();
    }
}
