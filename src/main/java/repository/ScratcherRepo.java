package repository;

import model.scratchers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScratcherRepo extends JpaRepository<scratchers, String> {
    List<scratchers> findAllScratchers();
    scratchers findByName(String name);
    scratchers insert(scratchers scratcher);
    scratchers update(scratchers scratcher);
    void delete(scratchers scratcher);
}
