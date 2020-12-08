package one.digitallinnovation.apipessoa.service;


import one.digitallinnovation.apipessoa.dto.request.PessoaDTO;
import one.digitallinnovation.apipessoa.dto.response.MensagemResponseDTO;
import one.digitallinnovation.apipessoa.entity.Pessoa;
import one.digitallinnovation.apipessoa.repository.PessoaRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitallinnovation.apipessoa.utils.PersonUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PessoaDTO personDTO = createFakeDTO();
        Pessoa expectedSavedPerson = createFakeEntity();

        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(expectedSavedPerson);

        MensagemResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId());
        MensagemResponseDTO succesMessage = pessoaService.criarPessoa(personDTO);

        assertEquals(expectedSuccessMessage, succesMessage);
    }

    private MensagemResponseDTO createExpectedMessageResponse(Long id) {
        return MensagemResponseDTO
                .builder()
                .mensagem("Pessoa criada com ID " + id)
                .build();
    }
}
