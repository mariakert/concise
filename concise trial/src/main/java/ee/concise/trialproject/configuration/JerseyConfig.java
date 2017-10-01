package ee.concise.trialproject.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import ee.concise.trialproject.data.DataController;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(DataController.class);
    }
}
