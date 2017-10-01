package ee.concise.trialproject.data;

import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Maria Kert on 30.09.2017.
 */
@Controller
@Path("/data")
public class DataController {

    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Data addWord(Data data) {
        return dataService.save(data);
    }

    @GET
    @Produces("application/json")
    public List<String> search(@QueryParam("search") String search) {
        return dataService.getWords(search);
    }
}
