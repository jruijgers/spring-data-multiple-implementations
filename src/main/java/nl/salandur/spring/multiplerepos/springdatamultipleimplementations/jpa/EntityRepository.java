package nl.salandur.spring.multiplerepos.springdatamultipleimplementations.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<TestObject, Long> {
}
