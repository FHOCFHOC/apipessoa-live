package one.digitallinnovation.apipessoa.mapper;


import one.digitallinnovation.apipessoa.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

   // @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
   // Pessoa toModel(PersonDTO personDTO);

   // PersonDTO toDTO(Pessoa person);
}
