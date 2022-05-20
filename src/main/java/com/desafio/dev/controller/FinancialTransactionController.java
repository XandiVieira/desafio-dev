package com.desafio.dev.controller;

import com.desafio.dev.model.FinancialTransaction;
import com.desafio.dev.service.FinancialTransactionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "api/v1/financial")
@Api(value = "Stores Financial Transactions")
public class FinancialTransactionController {

    @Autowired
    private FinancialTransactionService financialTransactionService;

    @PostMapping
    @ApiOperation(value = "Upload file.")
    @ApiResponses(value = {
            @ApiResponse(code = 422, message = "Invalid format."),
    })
    public FinancialTransaction createClient(@RequestParam("file") MultipartFile multipartFile) {
        return financialTransactionService.normalizeFile(multipartFile);
    }

}
