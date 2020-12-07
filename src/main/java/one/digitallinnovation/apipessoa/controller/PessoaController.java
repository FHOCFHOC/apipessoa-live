package one.digitallinnovation.apipessoa.controller;


import one.digitallinnovation.apipessoa.dto.request.PessoaDTO;
import one.digitallinnovation.apipessoa.dto.response.MensagemResponseDTO;
import one.digitallinnovation.apipessoa.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemResponseDTO criarPessoa(@RequestBody @Valid PessoaDTO pessoaDTO) {
        return pessoaService.criarPessoa(pessoaDTO);
    }

}
