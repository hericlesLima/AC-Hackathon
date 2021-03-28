package org.academiadecodigo.endemic_species.services;

import org.academiadecodigo.endemic_species.persistence.dao.AssociationDao;
import org.academiadecodigo.endemic_species.persistence.dao.EventDao;
import org.academiadecodigo.endemic_species.persistence.model.Association;
import org.academiadecodigo.endemic_species.persistence.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssociationImpl implements AssociationService {

    private AssociationDao associationDao;
    private EventDao eventDao;

    @Autowired
    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Autowired
    public void setAssociationDao(AssociationDao associationDao) {
        this.associationDao = associationDao;
    }

    @Override
    public Association get(Integer id) {
        return associationDao.findById(id);
    }

    @Override
    public List<Association> list() {
        return associationDao.findAll();
    }

    @Transactional
    @Override
    public Association save(Association association) {
        return associationDao.saveOrUpdate(association);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        associationDao.delete(id);
    }

    @Override
    public List<Event> getEvents(Integer id) {

        Association association = associationDao.findById(id);

        if (association == null) {
            throw new IllegalStateException();
        }

        return new ArrayList<>(associationDao.findById(id).getEvents());
    }

    @Override
    public Event addEvent(Integer id, Event event) {

        Association association = associationDao.findById(id);

        if (association == null) {
            throw new IllegalStateException();
        }

        association.addEvent(event);
        eventDao.saveOrUpdate(event);

        return association.getEvents().get(association.getEvents().size() - 1);
    }

}
