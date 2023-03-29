package org.iesfm.examen.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CompanyAppConfiguration.class);

        CompanyApp companyApp = context.getBean(CompanyApp.class);
        try {
            companyApp.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}