package az.edu.turing.uploadfile.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Base64;

@Data
public class UserDto {
    private String username;
    private int age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String profilePhoto;
}
