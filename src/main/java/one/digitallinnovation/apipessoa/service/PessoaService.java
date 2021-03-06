package one.digitallinnovation.apipessoa.service;


import one.digitallinnovation.apipessoa.dto.request.PessoaDTO;
import one.digitallinnovation.apipessoa.dto.response.MensagemResponseDTO;
import one.digitallinnovation.apipessoa.entity.Pessoa;
import one.digitallinnovation.apipessoa.exception.PersonNotFoundException;
import one.digitallinnovation.apipessoa.mapper.PersonMapper;
import one.digitallinnovation.apipessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public MensagemResponseDTO criarPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoaSalvar = personMapper.toModel(pessoaDTO);

        Pessoa pessoaSalva = pessoaRepository.save(pessoaSalvar);
        return criarMessageResponse(pessoaSalva.getId(), "Pessoa criada com ID ");
    }

    public List<PessoaDTO> listAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoas.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PessoaDTO findById(Long id) throws PersonNotFoundException {
        Pessoa person = verifyIfExists(id);

        return personMapper.toDTO(person);
    }

    public MensagemResponseDTO updateById(Long id, PessoaDTO pessoaDTO) throws PersonNotFoundException {
        verifyIfExists(id);

        Pessoa pessoaUpdate = personMapper.toModel(pessoaDTO);

        Pessoa updatedPerson = pessoaRepository.save(pessoaUpdate);
        return criarMessageResponse(updatedPerson.getId(), "Pessoa atualizada com ID ");
    }

    public void delete(Long id) throws PersonNotFoundException {
        verifyIfExists(id);
        pessoaRepository.deleteById(id);
    }

    private Pessoa verifyIfExists(Long id) throws PersonNotFoundException {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    private MensagemResponseDTO criarMessageResponse(Long id, String mensagem) {
        return MensagemResponseDTO
                .builder()
                .mensagem(mensagem + id)
                .build();
    }
}
