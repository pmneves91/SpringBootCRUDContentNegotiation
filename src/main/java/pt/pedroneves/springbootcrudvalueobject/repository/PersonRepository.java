package pt.pedroneves.springbootcrudvalueobject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.pedroneves.springbootcrudvalueobject.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
