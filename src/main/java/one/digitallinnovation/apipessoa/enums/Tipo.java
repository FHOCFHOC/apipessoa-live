package one.digitallinnovation.apipessoa.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tipo {

    HOME("Casa"),
    MOBILE("Celular"),
    COMMERCIAL("Commercial");

    private final String descricao;
}
