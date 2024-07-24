package az.edu.turing.uploadfile.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Data
public class UserEntity {
    @Id
    private Long id;
    private String fullName;
    private int age;
}
