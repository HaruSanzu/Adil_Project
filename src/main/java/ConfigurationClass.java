import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.RepoA;
import service.ServiceA;

@Configuration
public class ConfigurationClass {
    @Bean("serviceAFromConfigurationClass")
    public ServiceA getServiceA(){
        ServiceA serviceA = new ServiceA(new RepoA());
        return serviceA;
    }

}
