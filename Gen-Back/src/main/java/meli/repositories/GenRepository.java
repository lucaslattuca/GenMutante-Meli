package meli.repositories;

import meli.entities.Gen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenRepository extends JpaRepository<Gen, Integer> {


}
