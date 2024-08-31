package lt.vu.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import lt.vu.security.config.JwtProperties;

@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class Pwcsecurity2Application {
    public static void main(String[] args) {
        SpringApplication.run(Pwcsecurity2Application.class, args);
    }

}
