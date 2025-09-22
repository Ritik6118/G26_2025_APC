package g26.springbootg26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g26.springbootg26.entity.Student;

@Repository
public interface Student_repository extends JpaRepository<Student, Integer> {

}
