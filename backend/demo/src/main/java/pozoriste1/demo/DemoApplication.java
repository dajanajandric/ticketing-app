package pozoriste1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"pozoriste1.demo", "ticket_agents", "spectators", "plays", "tickets"})
@EnableJpaRepositories(basePackages = {"ticket_agents", "spectators", "plays", "tickets"})
@EntityScan(basePackages = {"ticket_agents", "spectators", "plays", "tickets"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
