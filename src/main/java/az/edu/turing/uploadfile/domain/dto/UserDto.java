package az.edu.turing.uploadfile.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private String username;
    private int age;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String profilePhoto;
}
