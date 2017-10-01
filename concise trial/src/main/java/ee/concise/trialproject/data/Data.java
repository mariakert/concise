package ee.concise.trialproject.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Maria Kert on 30.09.2017.
 */
@Entity
@Getter
@Setter
public class Data {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String data;
}
