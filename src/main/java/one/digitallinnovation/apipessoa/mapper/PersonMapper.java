package one.digitallinnovation.apipessoa.mapper;

import one.digitallinnovation.apipessoa.dto.request.PessoaDTO;
import one.digitallinnovation.apipessoa.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);
}
