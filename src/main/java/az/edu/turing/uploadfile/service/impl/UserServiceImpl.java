package az.edu.turing.uploadfile.service.impl;

import az.edu.turing.uploadfile.domain.dto.UserDto;
import az.edu.turing.uploadfile.domain.entity.UserEntity;
import az.edu.turing.uploadfile.domain.repository.UserRepository;
import az.edu.turing.uploadfile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<UserEntity> updateUser(Long id, UserEntity user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setFullName(user.getFullName());
                    existingUser.setAge(user.getAge());
                    return userRepository.save(existingUser);
                });
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public long getUserCount() {
        return userRepository.count();
    }
}