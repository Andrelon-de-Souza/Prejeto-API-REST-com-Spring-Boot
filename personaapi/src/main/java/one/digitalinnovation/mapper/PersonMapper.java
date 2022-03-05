package one.digitalinnovation.mapper;

import one.digitalinnovation.entity.Person;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public class PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy");

}
