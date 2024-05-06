package hogwarts.school2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import hogwarts.school2.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long>{
    Collection<Student> findAllByAge(int age);
}
