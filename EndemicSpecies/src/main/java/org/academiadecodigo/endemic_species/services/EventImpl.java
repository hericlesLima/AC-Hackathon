package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.dao.EventDao;
import org.academiadecodigo.endemic_species.persistence.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventImpl implements EventService {

    private EventDao eventDao;

    @Autowired
    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public Event get(Integer id) {
        return eventDao.findById(id);
    }

    @Override
    public List<Event> list() {
        return eventDao.findAll();
    }

    @Transactional
    @Override
    public Event save(Event event) {
        return eventDao.saveOrUpdate(event);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        eventDao.delete(id);
    }
}
