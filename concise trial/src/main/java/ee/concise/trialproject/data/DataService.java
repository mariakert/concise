package ee.concise.trialproject.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maria Kert on 30.09.2017.
 */
@Service
public class DataService {

    private DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public Data save(Data data) {
        return dataRepository.save(data);
    }

    public List<String> getWords(String searchString) {
        List<Data> matchingData = dataRepository.findByDataContainingIgnoreCase(searchString);
        List<String> stringList = new ArrayList<>();

        matchingData.forEach(data -> stringList.add(data.getData()));
        return stringList;
    }
}
