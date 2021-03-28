package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.model.Association;
import org.academiadecodigo.endemic_species.persistence.model.Event;

import java.util.List;

public interface AssociationService {

    Association get(Integer id);

    List<Association> list();

    Association save(Association Association);

    void delete(Integer id);

    List<Event> getEvents(Integer id);

    Event addEvent(Integer id, Event event);

}
