//package az.edu.turing.mapper;
//
//import az.edu.turing.uploadfile.domain.dto.UserDto;
//import az.edu.turing.uploadfile.domain.entity.UserEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//import org.springframework.stereotype.Component;
//
//@Component
//@Mapper (componentModel = "spring")
//public interface UserMapper {
//    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
//
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "wheelCount", target = "wheelCount")
//    @Mapping(source = "isManual", target = "isManual")
//    @Mapping(source = "productionDate", target = "productionDate")
//    @Mapping(source = "color", target = "color")
//    @Mapping(source = "price", target = "price")
//    @Mapping(source = "carType", target = "carType")
//    UserDto toDto(UserEntity entity);
//
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "wheelCount", target = "wheelCount")
//    @Mapping(source = "isManual", target = "isManual")
//    @Mapping(source = "productionDate", target = "productionDate")
//    @Mapping(source = "color", target = "color")
//    @Mapping(source = "price", target = "price")
//    @Mapping(source = "carType", target = "carType")
//    UserEntity toEntity(UserDto dto);
//}
