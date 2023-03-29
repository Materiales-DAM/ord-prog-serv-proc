package org.iesfm.examen.ioc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.examen.ioc.entity.Company;

import java.io.File;
import java.io.IOException;

public class CompanyReader {
    private ObjectMapper objectMapper;
    private String filePath;

    public CompanyReader(ObjectMapper objectMapper, String filePath) {
        this.objectMapper = objectMapper;
        this.filePath = filePath;
    }

    public Company readCompany() throws IOException {
        Company company = objectMapper.readValue(new File(filePath), Company.class);
        return company;
    }
}
