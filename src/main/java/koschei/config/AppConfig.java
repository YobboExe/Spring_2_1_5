package koschei.config;

import koschei.models.Island2;
import koschei.models.Ocean1;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Ocean1 getOcean(Island2 island) {
        return new Ocean1(island);
    }
}
