package one.digitallinnovation.apipessoa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitallinnovation.apipessoa.enums.Tipo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String numero;
}
