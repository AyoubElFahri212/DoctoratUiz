package ma.uiz.ac.poledoctorat.config;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SyncTaskExecutor;

@Configuration
public class AsyncSyncConfiguration {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        return new SyncTaskExecutor();
    }
}
