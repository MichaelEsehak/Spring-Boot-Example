package com.michael.sb;

import com.michael.sb.repo.impl.AbstractRepoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Michael
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = AbstractRepoImpl.class)
public class MainApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
    
}
