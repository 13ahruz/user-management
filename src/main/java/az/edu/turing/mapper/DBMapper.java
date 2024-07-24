//package az.edu.turing.mapper;
//
//import az.edu.turing.uploadfile.domain.entity.UserEntity;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//public class DBMapper {
//
//    public static UserEntity mapResultSetToUserEntity(ResultSet resultSet) throws SQLException {
//        UserEntity user = new UserEntity();
//        user.setId((UUID) resultSet.getObject("id"));
//        user.setUsername(resultSet.getString("username"));
//        user.setAge(resultSet.getInt("age"));
//        user.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
//        user.setUpdatedAt(resultSet.getTimestamp("updated_at").toLocalDateTime());
//        user.setProfilePhoto(resultSet.getString("profile_photo"));
//        return user;
//    }
//
//    public static List<UserEntity> mapResultSetToUserEntityList(ResultSet resultSet) throws SQLException {
//        List<UserEntity> userList = new ArrayList<>();
//        while (resultSet.next()) {
//            userList.add(mapResultSetToUserEntity(resultSet));
//        }
//        return userList;
//    }
//}
