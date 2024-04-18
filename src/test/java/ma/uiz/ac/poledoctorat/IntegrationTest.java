package ma.uiz.ac.poledoctorat;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ma.uiz.ac.poledoctorat.config.AsyncSyncConfiguration;
import ma.uiz.ac.poledoctorat.config.EmbeddedElasticsearch;
import ma.uiz.ac.poledoctorat.config.EmbeddedSQL;
import ma.uiz.ac.poledoctorat.config.JacksonConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { DoctoratUizApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
