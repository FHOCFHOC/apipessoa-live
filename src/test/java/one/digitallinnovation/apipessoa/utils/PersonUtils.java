package one.digitallinnovation.apipessoa.utils;

import one.digitallinnovation.apipessoa.dto.request.PessoaDTO;
import one.digitallinnovation.apipessoa.entity.Pessoa;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "boris";
    private static final String LAST_NAME = "carles";
    private static final String CPF_NUMBER = "453.725.560-99";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PessoaDTO createFakeDTO() {
        return PessoaDTO.builder()
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataNascimento("04-04-2010")
                .telefones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Pessoa createFakeEntity() {
        return Pessoa.builder()
                .id(PERSON_ID)
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataNascimento(BIRTH_DATE)
                .telefones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
