package az.edu.turing.uploadfile.controller;

import az.edu.turing.uploadfile.domain.entity.UserEntity;
import az.edu.turing.uploadfile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> updateUser(@PathVariable Long id, @RequestBody UserEntity user) {
        Optional<UserEntity> updatedUser = userService.getUserById(id).map(existingUser -> {
            existingUser.setFullName(user.getFullName());
            existingUser.setAge(user.getAge());
            return userService.updateUser(id, existingUser).get();
        });
        return ResponseEntity.of(Optional.of(updatedUser));
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> getUserById(@PathVariable Long id) {
        Optional<UserEntity> user = userService.getUserById(id);
        return ResponseEntity.of(Optional.of(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllUsers() {
        userService.deleteAllUsers();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getUserCount() {
        long count = userService.getUserCount();
        return ResponseEntity.ok(count);
    }
}
