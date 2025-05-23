package nl.salandur.spring.multiplerepos.springdatamultipleimplementations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;

@SpringBootApplication
@EntityScan
@EnableLdapRepositories
@EnableJpaRepositories
public class SpringDataMultipleImplementationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMultipleImplementationsApplication.class, args);
	}

}
