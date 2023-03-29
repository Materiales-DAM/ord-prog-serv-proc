package org.iesfm.examen.ioc;

import org.iesfm.examen.ioc.entity.Company;

import java.io.IOException;
import java.util.Scanner;

public class CompanyApp {
    private Scanner scanner;
    private CompanyReader companyReader;

    public CompanyApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run() throws IOException {
        Company company = companyReader.readCompany();
        int option;
        do {
            System.out.println("1. Mostrar");
            System.out.println("2. Listar departamentos");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.println(company);
            } else if(option == 2) {
                System.out.println(company.getDepartments());
            }

        } while(option != 3);
    }
}
