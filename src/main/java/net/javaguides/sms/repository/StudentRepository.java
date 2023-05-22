package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.*;

import net.javaguides.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
