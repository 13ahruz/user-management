package az.edu.turing.uploadfile.domain.repository;

import az.edu.turing.uploadfile.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
