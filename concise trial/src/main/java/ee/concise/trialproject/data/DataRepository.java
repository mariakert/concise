package ee.concise.trialproject.data;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by Maria Kert on 30.09.2017.
 */
public interface DataRepository extends CrudRepository<Data, Integer> {

    List<Data> findByDataContainingIgnoreCase(String data);
}
