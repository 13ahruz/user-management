package az.edu.turing.uploadfile.service;

import az.edu.turing.uploadfile.domain.dto.UserDto;
import az.edu.turing.uploadfile.domain.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    Optional<UserEntity> updateUser(Long id, UserEntity userEntity);
    List<UserEntity> getAllUsers();
    Optional<UserEntity> getUserById(Long id);
    void deleteUserById(Long id);
    void deleteAllUsers();
    long getUserCount();
}
