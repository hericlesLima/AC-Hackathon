package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.model.Event;

import java.util.List;

public interface EventService {

    Event get(Integer id);

    List<Event> list();

    Event save(Event event);

    void delete(Integer id);

}
