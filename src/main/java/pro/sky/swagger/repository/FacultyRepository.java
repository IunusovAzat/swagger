package pro.sky.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.swagger.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
}
