package org.iesfm.examen.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private String nif;

    private int filmId;
    private String fullName;

}
