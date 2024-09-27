package mashpavck.pack3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRep  extends JpaRepository<person, Long> {
    List<person> findByTittle(String tittle);

    List<person> findbAuthor(String Author);
    List<person> findByAuthorandTittle(String Author,String Tittle);

}
