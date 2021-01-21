package pt.pedroneves.springbootcrudcontentnegotiation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.pedroneves.springbootcrudcontentnegotiation.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
