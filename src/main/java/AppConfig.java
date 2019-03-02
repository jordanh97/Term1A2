import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="classX")
    public InterfaceA getService(){
        return new ClassX();
    }

}