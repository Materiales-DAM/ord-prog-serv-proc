package org.iesfm.examen.ioc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class CompanyAppConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public CompanyReader companyReader(
            ObjectMapper objectMapper,
            @Value("${input.path}") String path
    ) {
        return new CompanyReader(objectMapper, path);
    }

    @Bean
    public CompanyApp companyApp(
            Scanner scanner,
            CompanyReader companyReader
    ) {
        return new CompanyApp(scanner, companyReader);
    }

}
