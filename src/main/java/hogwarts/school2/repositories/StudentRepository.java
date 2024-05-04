package hogwarts.school2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import hogwarts.school2.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
