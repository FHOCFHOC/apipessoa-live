package one.digitallinnovation.apipessoa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    //@NotEmpty
   // @Size(min = 2, max = 100)
    private String firstName;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String lastName;

   // @NotEmpty
    //@CPF
    private String cpf;

    private String birthDate;

    //@Valid
    //@NotEmpty
    private List<TelefoneDTO> phones;
}
