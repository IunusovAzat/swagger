package pro.sky.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.swagger.model.Student;

public interface StudentRepository extends JpaRepository <Student,Long> {
}
