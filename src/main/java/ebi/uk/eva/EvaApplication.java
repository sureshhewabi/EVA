package ebi.uk.eva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author suresh
 *
 */
@SpringBootApplication
public class EvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaApplication.class, args);
	}
	
	@Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/studies").allowedOrigins("http://localhost:4200");
                registry.addMapping("/taxonomies").allowedOrigins("http://localhost:4200");
            }
        };
    }
}
