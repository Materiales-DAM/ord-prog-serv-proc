package org.iesfm.examen.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private String cif;
    private String name;
    private List<Department> departments;
}
