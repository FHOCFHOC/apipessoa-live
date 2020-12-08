package one.digitallinnovation.apipessoa.utils;

import one.digitallinnovation.apipessoa.dto.request.TelefoneDTO;
import one.digitallinnovation.apipessoa.entity.Telefone;
import one.digitallinnovation.apipessoa.enums.Tipo;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final Tipo PHONE_TYPE = Tipo.CELULAR;
    private static final long PHONE_ID = 1L;

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }

    public static Telefone createFakeEntity() {
        return Telefone.builder()
                .id(PHONE_ID)
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }
}
