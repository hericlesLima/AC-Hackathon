package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.model.Event;
import org.academiadecodigo.endemic_species.persistence.model.Specie;

import java.util.List;

public interface SpecieService {

    Specie get(Integer id);

    List<Specie> list();

    Specie save(Specie specie);

    void delete(Integer id);

}
